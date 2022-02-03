package cliente;

import dominio.*;
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import negocio.*;


public class ClientePersonaServicio {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente");

        try {
            
            Context jndi = new InitialContext();
            IPersonaServiceRemote personaServicie = (IPersonaServiceRemote) jndi.lookup("java:global/Academia_JEE-1.0/PersonServiceImpl!negocio.IPersonaServiceRemote");
            
            List<Persona> personas = personaServicie.listar();
            
            for(Persona persona: personas){
                System.out.println(persona);
            }
            
            System.out.println("Fin llamada al EJB desde el Cliente");
            
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}

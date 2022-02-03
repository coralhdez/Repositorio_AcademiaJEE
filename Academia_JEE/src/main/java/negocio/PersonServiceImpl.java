package negocio;

import dominio.Persona;
import java.util.*;
import javax.ejb.Stateless;

@Stateless
public class PersonServiceImpl implements IPersonaServiceRemote {

    @Override
    public List<Persona> listar() {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Antonio", "Recio", "arecio@gmail.com", "633822605"));
        personas.add(new Persona(2, "Luis", "Alonso", "lalonso@gmail.com", "687458965"));
        
        return personas;

    }

    @Override
    public Persona buscarPorId(Persona persona) {
        
        return null;
    }

    @Override
    public Persona buscarPorEmail(Persona persona) {
        return null;
    }

    @Override
    public void agregar() {

    }

    @Override
    public void actualizar() {

    }

    @Override
    public void borrar() {

    }

}

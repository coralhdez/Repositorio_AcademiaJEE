
package negocio;

import dominio.Persona;
import java.util.*;
import javax.ejb.Remote;

//Para que el cliente pueda acceder de forma remota al contenedor que se despliega en el contenedor de glasfish
@Remote
public interface IPersonaServiceRemote {
    
    public List<Persona> listar();
    
    public Persona buscarPorId(Persona persona);
    
    public Persona buscarPorEmail (Persona persona);
    
    public void agregar();
    
    public void actualizar();
    
    public void borrar();
    
    
}


import java.util.*;
public class AccionesPersona {
    
    /**Vamos hacer un crud */
    //mostrar personas
    public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    //listar a las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listaPersonas;
    }

    //registrar
    public void agregarPersona(Persona p){
        listaPersonas.add(p);
    }

    //buscar persona
    public Persona buscarPersona(int id){
        Persona encontrada = new Persona();
        for(Persona p : listaPersonas){
            if(id == p.getId()){
                encontrada = p;
            }else{
                System.out.println("Persona no encontrada");
            }
        }
        return encontrada;   
    }

    //actualizar
    public void actualizarPersona(Persona actualizada){
        Persona actualizar = buscarPersona(actualizada.getId());
        listaPersonas.remove(actualizar);
        listaPersonas.add(actualizar);
    }

    public void eliminarPersona(Persona eliminar){
        listaPersonas.remove(eliminar);
    }




}

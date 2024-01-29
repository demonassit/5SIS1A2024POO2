
import java.io.*;

/*
 * La serializacion es el proceso mediante el cual el programa puede traducir a un archivo los objetos que se le marquen para su almacenamiento
 * la serializacion puede ocurrir ya se a por objetos o por tipos de dato la diferencia radica principalmente en el buffer mediante el cual se envia o se extrae la informacion
 */

public abstract class Persona implements Serializable {

    private String nombre;
    private int edad;
    
    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    abstract String tipoPersona();    

}


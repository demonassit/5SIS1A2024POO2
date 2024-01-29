package 03Serializacion;

public class Alumno extends Persona {
    private int boleta;

    public Alumno(){


    }

    public Alumno(int boleta){
        this.boleta = boleta;
    }

    public Alumno(int boleta, String nombre, int edad){
        super(nombre, edad);
        this.boleta = boleta;
    }

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    @Override
    String tipoPersona(){
        return ("Alumno");
    }

    
}

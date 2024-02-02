import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {
    
    ArrayList<Persona> listapersonas = new ArrayList<>();
    String rep = "si";
    String nombre = "";
    int edad, num_empleado, bol;

    //ahora aplicamos polimorfismo
    Persona alumno = new Alumno();
    //trabajador Persona trabajador = new Trabajador();

    //menu
    void menu(){

        while(true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada: \n"
                    +"1.- Registrar Alumno\n"
                    +"2.- Consultar Alumno\n"
                    +"3.- Salir\n");
                    if(var == null){
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    switch (opcion) {
                        case 1:
                            //metodo para pedir datos
                            pedirDatosAlumno();
                            alumno = new Alumno(bol, nombre, edad);
                            guardarAlumno();
                            
                            break;
                    
                        default:
                            System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("¿Desea repetir?");
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }

    private void pedirDatosAlumno(){
        bol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta: "));
        nombre = JOptionPane.showInputDialog("Ingresa el nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
    }

    private void guardarAlumno(){
        listapersonas.add(alumno);
    }

    //metodo para leer un archivo
    private void leerAlumnos() throws Exception{
        //definir donde esta el archivo que esta guardando la informacion
        FileInputStream archivo = new FileInputStream("archivo.dat");
        //generar la lectura de los objetos
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //tenemos que transformar los objetos porque por defecto su lectura en bytes por lo tanto debo castear a un objeto
        listapersonas = (ArrayList)entrada.readObject();

        for(int i = 0; i < listapersonas.size(); i++){
            //recorro lo que necesito del objeto
            Alumno obj = (Alumno)listapersonas.get(i);
            //obtener la informacion
            JOptionPane.showMessageDialog(null, "\n "
            + "Numero de Alumno: " + (i+1) + "\n"
            + "Boleta: " + obj.getBoleta() + "\n"
            + "Nombre del Alumno: " + obj.getNombre() + "\n"
            + "Edad del Alumno: " + obj.getEdad() + "\n"
            + "Tipo de Persona : " + obj.tipoPersona() + "\n");
        }

        private void guardar() throw Exception{
            //debo de generar el archivo de salida
            FileOutputStream archivo = new FileOutputStream("archivo.dat");
            //definimos que es un buffer de objetos
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            //empiezo a escribir
            salida.writeObject(listapersonas);
            salida.close();
        }

    }




}

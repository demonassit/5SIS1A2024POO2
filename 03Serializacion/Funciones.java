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




}

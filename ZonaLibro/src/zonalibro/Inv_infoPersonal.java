/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Scanner;
/**
 *
 * @author felip
 */
public class Inv_infoPersonal {
Scanner leer1 = new Scanner(System.in);
    
public Inv_infoPersonal(){
    
}// Fin constructor

public void info_empleado(){
    
        
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("Bienvenido a la información personal para empleados, a continuación ingrese sus datos: ");
    System.out.println("---------------------------------------------------------------------------------------");
    
    System.out.println("Ingrese su nombre: ");
    String nom_empleado = leer1.next();
    System.out.println("Ingrese su apellido: ");
    String ape_empleado = leer1.next();
    System.out.println("Ingrese su número de cédula: ");
    String cedula = leer1.next();
    System.out.println("Ingrese su número de teléfono: ");
    String telefono = leer1.next();
    System.out.println("Ingrese su id de empleado: ");
    String id_empleado = leer1.next();
    
    System.out.println("--------------------------------------------------------");
    System.out.println("---Información de empleado---");
    System.out.println("Empleado: " +nom_empleado+ " " +ape_empleado);
    System.out.println("Cédula de identidad: " +cedula);
    System.out.println("Contacto: " +telefono);
    System.out.println("Id de empleado: " +id_empleado);
    System.out.println("--------------------------------------------------------");
    System.out.println("");

    
    
    
}// Fin metodo info empleado
    
}// Fin clase 

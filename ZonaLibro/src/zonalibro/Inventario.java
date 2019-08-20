/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Inventario {
    
    Scanner leer = new Scanner(System.in);    
    
    public String novela[] = {"Anna Karenina", "La Dama de las Camelias", "El Conde de Montecristo"};
    private int i = 3; //cantidad actual ocupada en el array
    private int capac = 7;
    private int agregar = 0;
    
    //Creacion de objetos de las clases
    Switch_inv_LibrosVenta switch_LV = new Switch_inv_LibrosVenta();
    Switch_inv_LibrosPres switch_LP = new Switch_inv_LibrosPres();
    Switch_inv_impresion switch_imp = new Switch_inv_impresion();
    Inv_infoPersonal info_personal = new Inv_infoPersonal();
    
       
    //Inicializacion de usuarios y contrasenas
    String u = "";
    String c = "";
    String u_felipe = "fhidargue";
    String c_felipe = "f123";
    String u_steven = "luisteven";
    String c_steven = "l123";
    String u_wendy = "wendy";
    String c_wendy = "w123";
    String u_meli = "meli";
    String c_meli = "m123";
    
     //Ventas
        int cant_a1_v = 54;
        int cant_a2_v = 65;
        int cant_a3_v = 43;
        int cant_cf1_v = 54;
        int cant_cf2_v = 23;
        int cant_cf3_v = 15;
        int cant_ch1_v = 76;
        int cant_ch2_v = 54;
        int cant_ch3_v = 67;
        int cant_g1_v = 87;
        int cant_g2_v = 16;
        int cant_g3_v = 65;
        int cant_pl1_v = 43;
        int cant_pl2_v = 51;
        int cant_pl3_v = 52;
        int cant_pa1_v = 53;
        int cant_pa2_v = 65;
        int cant_pa3_v = 43;
        int cant_f1_v = 76;
        int cant_f2_v = 43;
        int cant_f3_v = 41;
        
        //Prestamos
        int cant_a1_p = 23;
        int cant_a2_p = 21;
        int cant_a3_p = 32;
        int cant_cf1_p = 34;
        int cant_cf2_p = 12;
        int cant_cf3_p = 32;
        int cant_ch1_p = 54;
        int cant_ch2_p = 65;
        int cant_ch3_p = 42;
        int cant_g1_p = 21;
        int cant_g2_p = 35;
        int cant_g3_p = 24;
        int cant_pl1_p = 17;
        int cant_pl2_p = 26;
        int cant_pl3_p = 34;
        int cant_pa1_p = 28;
        int cant_pa2_p = 10;
        int cant_pa3_p = 23;
        int cant_f1_p = 19;
        int cant_f2_p = 18;
        int cant_f3_p = 17;
    
    public void Categoria() {   
        
            System.out.println("Ingrese su identificación de empleado o usuario: ");
            u = leer.next();
     
            if(u.equals(u_felipe)||u.equals(u_steven)||u.equals(u_wendy)||u.equals(u_meli)){
            
                System.out.println("Ingrese la contraseña: "); 
                c = leer.next();
                
                if(c.equals(c_felipe)||c.equals(c_steven)||c.equals(c_wendy)||c.equals(c_meli)){
                    
                int elegir_inv = 0;
                int decision = 0;
                
                do{
                
                System.out.println("---------------------");
                System.out.println("Modificar Inventario: \n1. Libros Venta \n2. Libros Préstamo \n3. Información personal"); 
                elegir_inv = leer.nextInt();
                
                switch(elegir_inv) {
                
                        case 1: 
                            switch_LV.inv_LV();
                        break;
                        
                        case 2:
                            switch_LP.inv_LP();
                        break;   
                        
                        case 3:
                            info_personal.info_empleado();
                        break;
                                 
                                    
                            
                }// Fin switch elegir inventario
                
                
                        
                  
        
                  
            System.out.println("-----------------------------------");   
            System.out.println("Quiere realizar otra modificación?\n1. Si\n2. No");
            decision = leer.nextInt();
            
            }while(decision!=2);
                }// Fin IF verificacion de contrasena
                
                
            else{
                System.out.println("Contraseña incorrecta, intente nuevamente.");
            }
            }// Fin IF verificacion de usuario
            
            else{
                System.out.println("Usuario incorrecto, intente nuevamente.");        
                        }
            
                            
         
        
           
        
        }//Fin Categoria
             
    
}//fin Inventario

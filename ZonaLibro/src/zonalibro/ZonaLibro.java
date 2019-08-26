/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Scanner;

/**
 *
 * @author WUM
 */
public class ZonaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
            
    Scanner leer = new Scanner(System.in);
        
    Carrito pago = new Carrito();
    Inventario invent = new Inventario();
    Producto product = new Producto();
    Usuario usuario = new Usuario();


    
    int opcion;
    do { 
        System.out.println("\nBienvenidos a ZONALIBRO \n-----MENÚ DE OPCIONES-----");
        System.out.println("1. Clientes \n2. Empleados \n3. Registro \n0. Salir");
        //debería colocarse un password por si un cliente digita 2
        opcion = leer.nextInt();
        switch(opcion) {
            case 1:
                product.comprar();
            break;    
            case 2:
                invent.Categoria();
            break;
            case 3:
                usuario.Registro();
            break;    
            
        }//fin switch
        
        }while(opcion!=0);
        
    
    }//fin main
   
}//fin ZonaLibro

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
public class ZonaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los productos deberían manipularse por medio de una matriz multidimensional de diferentes tipos de datos. 
        Como aún no se ha estudiado, por el momento se utiliza un array para asociar los títulos al tipo de producto
        Una vez se adquiera el conocimiento al título se va a asociar el autor, idioma, precio, disponibilidad...
        */
            
    Scanner leer = new Scanner(System.in);
        
    Carrito pago = new Carrito();
    Inventario invent = new Inventario();
    Producto product = new Producto();
    Usuario usuario = new Usuario();
    EnvioDomicilio envio = new EnvioDomicilio();
    
    int opcion;
    do { 
        System.out.println("Bienvenidos a ZONALIBRO \n-----MENÚ DE OPCIONES-----");
        System.out.println("1. Clientes \n2. Empleados \n3. Registro \n0. Salir");
        //debería colocarse un password por si un cliente digita 2
        opcion = leer.nextInt();
        switch(opcion) {
            case 1:
                product.Comprar();
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

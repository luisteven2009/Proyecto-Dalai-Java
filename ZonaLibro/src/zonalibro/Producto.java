/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Producto {
    Scanner leer = new Scanner(System.in);
    Inventario invent = new Inventario();
    Carrito pago = new Carrito();
    
    
    int opcion = 0;
    int i;
    String libro;
    
    public void Comprar() {
        do {
        System.out.println("Digite el libro que desea: ");
        libro = leer.nextLine();
        
       opcion = 0;
       

       //invent: objeto para mostrar el array de la clase Inventario
       for(i=0; i<invent.novela.length; i++) {
                      
        //por alguna razón aún no descubierta acá da error apesar de que sí entra al if e imprime la info   
        if(invent.novela[i].equalsIgnoreCase(libro)) {
           System.out.println("Libro: "+invent.novela[i]+ "\n. Autor: León Tolstói \n. Idioma: Español \n. Precio: "+pago.precio);
           
           System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
           opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
        if(opcion==1) {
            pago.SumProduct +=pago.precio;                        
        }//fin if                   
        }//fin if  
        else {
        //Acá iría el formulario para solicitarlo
        System.out.println("Libro no disponible");
        } //fin else
       }//fin for
       

       System.out.println("Continuar comprando: \n1. Sí \n2. No");
       opcion = leer.nextInt();
    }while(opcion!=2);      
    
    }//fin Comprar

    //constructor
    public Producto() {
    }//fin cosntructor
       
}//fin Producto    



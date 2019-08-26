/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Scanner;

public class EnvioDomicilio {
    Scanner leer = new Scanner(System.in);
    Carrito pago = new Carrito();
    public int flete = 2500;
    
    //constructor
    public EnvioDomicilio(Carrito pago){
        this.pago = pago;
    }//fin constructor
    
    public void totalEnvio(){
        pago.añadirPrecio(flete);
        System.out.println("El flete a pagar es: ¢"+flete);
        System.out.println("El precio total incluyendo el flete es ¢"+pago.getCuenta());
    }//fin totalEnvio
    
}//fin EnvioDomicilio
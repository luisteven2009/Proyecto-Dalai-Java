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
    public float flete = 2500;
    
    public void totalEnvio(){
        pago.SumProduct += flete;
        System.out.println("El flete a pagar es: "+flete);
        System.out.println("El precio total incluyendo el flete es "+pago.SumProduct);
}
    }
    
    

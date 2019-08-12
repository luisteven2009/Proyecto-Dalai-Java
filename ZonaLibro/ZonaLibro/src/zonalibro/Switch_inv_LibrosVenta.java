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
public class Switch_inv_LibrosVenta {
Scanner leer = new Scanner(System.in); 
    
public Switch_inv_LibrosVenta() {
    
}// Fin constructor

public void inv_LV() {
    
    // Inicializacion de las cantidades de inventario por genero
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
    
     //Vectores de 3 libros por genero
    String[] g_a = new String[3];
    g_a[0] = "La Odisea";
    g_a[1] = "Harry Potter";
    g_a[2] = "Hojas perdidas";
    
    String[] g_cf = new String[3];
    g_cf[0] = "Star Wars";
    g_cf[1] = "La Guerra de los Mundos";
    g_cf[2] = "Soy Leyenda";
    
    String[] g_ch = new String[3];
    g_ch[0] = "Rapunzel";
    g_ch[1] = "Blanca Nieves";
    g_ch[2] = "El Patito Feo";
    
    String[] g_g = new String[3];
    g_g[0] = "Frankenstein";
    g_g[1] = "El Monje";
    g_g[2] = "El Fantasma de la ópera";
    
    String[] g_pl = new String[3];
    g_pl[0] = "No cierres los ojos";
    g_pl[1] = "La pareja de al lado";
    g_pl[2] = "La tristeza del Samurai";
    
    String[] g_pa = new String[3];
    g_pa[0] = "Alados";
    g_pa[1] = "Sobrenatural";
    g_pa[2] = "Pasaje al Misterio";
    
    String[] g_f = new String[3];
    g_f[0] = "Los Jardines de la Luna";
    g_f[1] = "Todas las Hadas del Reino";
    g_f[2] = "El Camino de las Sombras";

    //Inicializacion de las variables 
    int elegir_genero = 0;
    int elegir_libro = 0;
    int elegir_sr = 0;
    int modif = 0;
    
                                System.out.println("Género: \n1. Aventura\n2. Ciencia Ficción\n3. Cuentos de Hadas\n4. Gótica\n5. Policíaca\n6. Paranormal\n7. Fantástica");
                                elegir_genero = leer.nextInt();
                        
                                    switch (elegir_genero) {
                        
                                    case 1:
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_a[0]+ "\n2. " +g_a[1]+ "\n3. " +g_a[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_a1_v = cant_a1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[0]+ " es: " +cant_a1_v);
                                            }
                                            else{
                                                cant_a1_v = cant_a1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[0]+ " es: " +cant_a1_v);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_a2_v = cant_a2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[1]+ " es: " +cant_a2_v);
                                            }
                                            else{
                                                cant_a2_v = cant_a2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[1]+ " es: " +cant_a2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_a3_v = cant_a3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[2]+ " es: " +cant_a3_v);
                                            }
                                            else{
                                                cant_a3_v = cant_a3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[2]+ " es: " +cant_a3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 2:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_cf[0]+ "\n2. " +g_cf[1]+ "\n3. " +g_cf[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_cf1_v = cant_cf1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[0]+ " es: " +cant_cf1_v);
                                            }
                                            else{
                                                cant_cf1_v = cant_cf1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[0]+ " es: " +cant_cf1_v);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_cf2_v = cant_cf2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[1]+ " es: " +cant_cf2_v);
                                            }
                                            else{
                                                cant_cf2_v = cant_cf2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[1]+ " es: " +cant_cf2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_cf3_v = cant_cf3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[2]+ " es: " +cant_cf3_v);
                                            }
                                            else{
                                                cant_cf3_v = cant_cf3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[2]+ " es: " +cant_cf3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 3:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_ch[0]+ "\n2. " +g_ch[1]+ "\n3. " +g_ch[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_ch1_v = cant_ch1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[0]+ " es: " +cant_ch1_v);
                                            }
                                            else{
                                                cant_ch1_v = cant_ch1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[0]+ " es: " +cant_ch1_v);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_ch2_v = cant_ch2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[1]+ " es: " +cant_ch2_v);
                                            }
                                            else{
                                                cant_ch2_v = cant_ch2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[1]+ " es: " +cant_ch2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_ch3_v = cant_ch3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[2]+ " es: " +cant_ch3_v);
                                            }
                                            else{
                                                cant_ch3_v = cant_ch3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[2]+ " es: " +cant_ch3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 4:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_g[0]+ "\n2. " +g_g[1]+ "\n3. " +g_g[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_g1_v = cant_g1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[0]+ " es: " +cant_g1_v);
                                            }
                                            else{
                                                cant_g1_v = cant_g1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[0]+ " es: " +cant_g1_v);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_g2_v = cant_g2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[1]+ " es: " +cant_g2_v);
                                            }
                                            else{
                                                cant_g2_v = cant_g2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[1]+ " es: " +cant_g2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_g3_v = cant_g3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[2]+ " es: " +cant_g3_v);
                                            }
                                            else{
                                                cant_g3_v = cant_g3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[2]+ " es: " +cant_g3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 5:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_pl[0]+ "\n2. " +g_pl[1]+ "\n3. " +g_pl[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pl1_v = cant_pl1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[0]+ " es: " +cant_pl1_v);
                                            }
                                            else{
                                                cant_pl1_v = cant_pl1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[0]+ " es: " +cant_pl1_v);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pl2_v = cant_pl2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[1]+ " es: " +cant_pl2_v);
                                            }
                                            else{
                                                cant_pl2_v = cant_pl2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[1]+ " es: " +cant_pl2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pl3_v = cant_pl3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[2]+ " es: " +cant_pl3_v);
                                            }
                                            else{
                                                cant_pl3_v = cant_pl3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[2]+ " es: " +cant_pl3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 6:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_pa[0]+ "\n2. " +g_pa[1]+ "\n3. " +g_pa[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pa1_v = cant_pa1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[0]+ " es: " +cant_pa1_v);
                                            }
                                            else{
                                                cant_pa1_v = cant_pa1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[0]+ " es: " +cant_pa1_v);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pa2_v = cant_pa2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[1]+ " es: " +cant_pa2_v);
                                            }
                                            else{
                                                cant_pa2_v = cant_pa2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[1]+ " es: " +cant_pa2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pa3_v = cant_pa3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[2]+ " es: " +cant_pa3_v);
                                            }
                                            else{
                                                cant_pa3_v = cant_pa3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[2]+ " es: " +cant_pa3_v);
                                            }
                                            
                                            break;
                                            
                                    }
                                break;
                                
                                
                                case 7:
                                
                                    System.out.println("----------------------------------------------------------");
                                    System.out.println("Elija el libro al cual le desea modificar el inventario:\n1. " +g_f[0]+ "\n2. " +g_f[1]+ "\n3. " +g_f[2]);
                                    elegir_libro = leer.nextInt();
                                    
                                    switch(elegir_libro){
                                        case 1:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_f1_v = cant_f1_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[0]+ " es: " +cant_f1_v);
                                            }
                                            else{
                                                cant_f1_v = cant_f1_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[0]+ " es: " +cant_f1_v);
                                            }
                                            break;
                                        case 2:

                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_f2_v = cant_f2_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[1]+ " es: " +cant_f2_v);
                                            }
                                            else{
                                                cant_f2_v = cant_f2_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[1]+ " es: " +cant_f2_v);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_f3_v = cant_f3_v + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[2]+ " es: " +cant_f3_v);
                                            }
                                            else{
                                                cant_f3_v = cant_f3_v - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[2]+ " es: " +cant_f3_v);
                                            }
                                            
                                            break;
    
    
}// Fin switch elegir libro
}// Fin switch elegir genero

}// Fin metodo inv_LV

}// Fin de la clase Switch_inv_LibrosVenta
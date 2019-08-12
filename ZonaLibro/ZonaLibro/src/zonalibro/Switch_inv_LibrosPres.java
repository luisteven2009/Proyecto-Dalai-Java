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
public class Switch_inv_LibrosPres {
Scanner leer = new Scanner(System.in); 

public Switch_inv_LibrosPres() {
    
}// Fin constructor    

public void inv_LP(){
    
    // Inicializacion de las cantidades de inventario por genero
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
                                                cant_a1_p = cant_a1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[0]+ " es: " +cant_a1_p);
                                            }
                                            else{
                                                cant_a1_p = cant_a1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[0]+ " es: " +cant_a1_p);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_a2_p = cant_a2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[1]+ " es: " +cant_a2_p);
                                            }
                                            else{
                                                cant_a2_p = cant_a2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[1]+ " es: " +cant_a2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_a3_p = cant_a3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[2]+ " es: " +cant_a3_p);
                                            }
                                            else{
                                                cant_a3_p = cant_a3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_a[2]+ " es: " +cant_a3_p);
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
                                                cant_cf1_p = cant_cf1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[0]+ " es: " +cant_cf1_p);
                                            }
                                            else{
                                                cant_cf1_p = cant_cf1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[0]+ " es: " +cant_cf1_p);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_cf2_p = cant_cf2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[1]+ " es: " +cant_cf2_p);
                                            }
                                            else{
                                                cant_cf2_p = cant_cf2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[1]+ " es: " +cant_cf2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_cf3_p = cant_cf3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[2]+ " es: " +cant_cf3_p);
                                            }
                                            else{
                                                cant_cf3_p = cant_cf3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_cf[2]+ " es: " +cant_cf3_p);
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
                                                cant_ch1_p = cant_ch1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[0]+ " es: " +cant_ch1_p);
                                            }
                                            else{
                                                cant_ch1_p = cant_ch1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[0]+ " es: " +cant_ch1_p);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_ch2_p = cant_ch2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[1]+ " es: " +cant_ch2_p);
                                            }
                                            else{
                                                cant_ch2_p = cant_ch2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[1]+ " es: " +cant_ch2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_ch3_p = cant_ch3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[2]+ " es: " +cant_ch3_p);
                                            }
                                            else{
                                                cant_ch3_p = cant_ch3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_ch[2]+ " es: " +cant_ch3_p);
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
                                                cant_g1_p = cant_g1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[0]+ " es: " +cant_g1_p);
                                            }
                                            else{
                                                cant_g1_p = cant_g1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[0]+ " es: " +cant_g1_p);
                                            }
                                            break;
                                        case 2:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_g2_p = cant_g2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[1]+ " es: " +cant_g2_p);
                                            }
                                            else{
                                                cant_g2_p = cant_g2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[1]+ " es: " +cant_g2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_g3_p = cant_g3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[2]+ " es: " +cant_g3_p);
                                            }
                                            else{
                                                cant_g3_p = cant_g3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_g[2]+ " es: " +cant_g3_p);
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
                                                cant_pl1_p = cant_pl1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[0]+ " es: " +cant_pl1_p);
                                            }
                                            else{
                                                cant_pl1_p = cant_pl1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[0]+ " es: " +cant_pl1_p);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pl2_p = cant_pl2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[1]+ " es: " +cant_pl2_p);
                                            }
                                            else{
                                                cant_pl2_p = cant_pl2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[1]+ " es: " +cant_pl2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pl3_p = cant_pl3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[2]+ " es: " +cant_pl3_p);
                                            }
                                            else{
                                                cant_pl3_p = cant_pl3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pl[2]+ " es: " +cant_pl3_p);
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
                                                cant_pa1_p = cant_pa1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[0]+ " es: " +cant_pa1_p);
                                            }
                                            else{
                                                cant_pa1_p = cant_pa1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[0]+ " es: " +cant_pa1_p);
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pa2_p = cant_pa2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[1]+ " es: " +cant_pa2_p);
                                            }
                                            else{
                                                cant_pa2_p = cant_pa2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[1]+ " es: " +cant_pa2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_pa3_p = cant_pa3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[2]+ " es: " +cant_pa3_p);
                                            }
                                            else{
                                                cant_pa3_p = cant_pa3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_pa[2]+ " es: " +cant_pa3_p);
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
                                                cant_f1_p = cant_f1_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[0]+ " es: " +cant_f1_p);
                                            }
                                            else{
                                                cant_f1_p = cant_f1_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[0]+ " es: " +cant_f1_p);
                                            }
                                            break;
                                        case 2:

                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_f2_p = cant_f2_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[1]+ " es: " +cant_f2_p);
                                            }
                                            else{
                                                cant_f2_p = cant_f2_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[1]+ " es: " +cant_f2_p);
                                            }
                                            
                                            break;
                                        case 3:
                                            
                                            System.out.println("Desea:\n1. Sumar\n2. Restar");
                                            elegir_sr = leer.nextInt();
                                            System.out.println("Escriba la cantidad a modificar: ");
                                            modif = leer.nextInt();
                                            
                                            if(elegir_sr==1){
                                                cant_f3_p = cant_f3_p + modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[2]+ " es: " +cant_f3_p);
                                            }
                                            else{
                                                cant_f3_p = cant_f3_p - modif;
                                                System.out.println("Nueva cantidad del libro " +g_f[2]+ " es: " +cant_f3_p);
                                            }
                                            
                                            break;
    
}// Fin switch elegir libro
}// Fin switch elegir genero
    
    
    
    
    
    
    
}
}

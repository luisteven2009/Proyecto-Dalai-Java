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
public class Switch_inv_impresion {
Scanner leer = new Scanner(System.in);

    
public Switch_inv_impresion(){
    
}// Fin constructor

public void inv_impresion(){
    
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
    
    int elegir_inv = 0;
    int elegir_g_imp = 0;
    
    
    System.out.println("------------------------------------------------");
    System.out.println("Elija que sección del inventario desea imprimir:\n1.Libros Venta\n2.Libros Préstamo");
    elegir_inv = leer.nextInt();
    
        switch(elegir_inv){
            case 1:
            System.out.println("-----------------------------------");
            System.out.println("Elija el género que desea imprimir:\n1. Aventura\n2. Ciencia Ficción\n3. Cuentos de Hadas\n4. Gótica\n5. Policíaca\n6. Paranormal\n7. Fantástica");
            elegir_g_imp = leer.nextInt();
    
                switch(elegir_g_imp){
                case 1:
                    System.out.println("---Libros de Aventura---");
                    System.out.println(""+g_a[0]+ ": "+cant_a1_v);
                    System.out.println(""+g_a[1]+ ": "+cant_a2_v);
                    System.out.println(""+g_a[2]+ ": "+cant_a3_v);

                break;
                case 2:
                    System.out.println("---Libros de Ciencia Ficción---");
                    System.out.println(""+g_cf[0]+ ": "+cant_cf1_v);
                    System.out.println(""+g_cf[1]+ ": "+cant_cf2_v);
                    System.out.println(""+g_cf[2]+ ": "+cant_cf3_v);
                break;
                case 3:
                    System.out.println("---Libros de Cuentos de Hadas---");
                    System.out.println(""+g_ch[0]+ ": "+cant_ch1_v);
                    System.out.println(""+g_ch[1]+ ": "+cant_ch2_v);
                    System.out.println(""+g_ch[2]+ ": "+cant_ch3_v);
                break;
                case 4:
                    System.out.println("---Libros de Gótica---");
                    System.out.println(""+g_g[0]+ ": "+cant_g1_v);
                    System.out.println(""+g_g[1]+ ": "+cant_g2_v);
                    System.out.println(""+g_g[2]+ ": "+cant_g3_v);
                break;
                case 5:
                    System.out.println("---Libros de Policíaca---");
                    System.out.println(""+g_pl[0]+ ": "+cant_pl1_v);
                    System.out.println(""+g_pl[1]+ ": "+cant_pl2_v);
                    System.out.println(""+g_pl[2]+ ": "+cant_pl3_v);
                break;
                case 6:
                    System.out.println("---Libros de Paranormal---");
                    System.out.println(""+g_pa[0]+ ": "+cant_pa1_v);
                    System.out.println(""+g_pa[1]+ ": "+cant_pa2_v);
                    System.out.println(""+g_pa[2]+ ": "+cant_pa3_v);
                break;
                case 7:
                    System.out.println("---Libros de Fantástica---");
                    System.out.println(""+g_f[0]+ ": "+cant_f1_v);
                    System.out.println(""+g_f[1]+ ": "+cant_f2_v);
                    System.out.println(""+g_f[2]+ ": "+cant_f3_v);
                break;
        }// Fin switch elegir_g_imp
                break;
                
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("Elija el género que desea imprimir:\n1. Aventura\n2. Ciencia Ficción\n3. Cuentos de Hadas\n4. Gótica\n5. Policíaca\n6. Paranormal\n7. Fantástica");
                elegir_g_imp = leer.nextInt();
    
                switch(elegir_g_imp){
                case 1:
                    System.out.println("---Libros de Aventura---");
                    System.out.println(""+g_a[0]+ ": "+cant_a1_p);
                    System.out.println(""+g_a[1]+ ": "+cant_a2_p);
                    System.out.println(""+g_a[2]+ ": "+cant_a3_p);

                break;
                case 2:
                    System.out.println("---Libros de Ciencia Ficción---");
                    System.out.println(""+g_cf[0]+ ": "+cant_cf1_p);
                    System.out.println(""+g_cf[1]+ ": "+cant_cf2_p);
                    System.out.println(""+g_cf[2]+ ": "+cant_cf3_p);
                break;
                case 3:
                    System.out.println("---Libros de Cuentos de Hadas---");
                    System.out.println(""+g_ch[0]+ ": "+cant_ch1_p);
                    System.out.println(""+g_ch[1]+ ": "+cant_ch2_p);
                    System.out.println(""+g_ch[2]+ ": "+cant_ch3_p);
                break;
                case 4:
                    System.out.println("---Libros de Gótica---");
                    System.out.println(""+g_g[0]+ ": "+cant_g1_p);
                    System.out.println(""+g_g[1]+ ": "+cant_g2_p);
                    System.out.println(""+g_g[2]+ ": "+cant_g3_p);
                break;
                case 5:
                    System.out.println("---Libros de Policíaca---");
                    System.out.println(""+g_pl[0]+ ": "+cant_pl1_p);
                    System.out.println(""+g_pl[1]+ ": "+cant_pl2_p);
                    System.out.println(""+g_pl[2]+ ": "+cant_pl3_p);
                break;
                case 6:
                    System.out.println("---Libros de Paranormal---");
                    System.out.println(""+g_pa[0]+ ": "+cant_pa1_p);
                    System.out.println(""+g_pa[1]+ ": "+cant_pa2_p);
                    System.out.println(""+g_pa[2]+ ": "+cant_pa3_p);
                break;
                case 7:
                    System.out.println("---Libros de Fantástica---");
                    System.out.println(""+g_f[0]+ ": "+cant_f1_p);
                    System.out.println(""+g_f[1]+ ": "+cant_f2_p);
                    System.out.println(""+g_f[2]+ ": "+cant_f3_p);
                break;
        }// Fin switch elegir_g_imp
                
            break;
        }// Fin switch elegir_inv
    
    
    
    
}// Fin metodo inv_impresion
    
}// Fin clase Switch_inv_impresion

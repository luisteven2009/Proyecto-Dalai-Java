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
    Switch_inv_LibrosVenta compraLV = new Switch_inv_LibrosVenta();
    EnvioDomicilio envdom = new EnvioDomicilio();
    
    String[] arrayProduct = new String[4];
    String[] formularioLibroNuevo = new String[]{};
    int opcion = 0;
    int encarg = 0;
    int i;
    String libro;
    boolean esta = false;
    
    public String[] g_a = new String[3];
    public Object[][] g_a1 = new Object[3][3];
    public String[] g_cf = new String[3];
    public Object[][] g_cf1 = new Object[3][3];
    public String[] g_ch = new String[3];
    public Object[][] g_ch1 = new Object[3][3];
    public String[] g_g = new String[3];
    public Object[][] g_g1 = new Object[3][3];
    public String[] g_pl = new String[3];
    public Object[][] g_pl1 = new Object[3][3];
    public String[] g_pa = new String[3];
    public Object[][] g_pa1 = new Object[3][3];
    public String[] g_f = new String[3];
    public Object[][] g_f1 = new Object[3][3];
    
    
    public void Comprar() {
        g_a[0] = "La Odisea";
        g_a[1] = "Harry Potter";
        g_a[2] = "Hojas perdidas";
        g_a1[0][0] = g_a[0];
        g_a1[0][1] = "Homero";
        g_a1[0][2] = 5900;
        g_a1[1][0] = g_a[1];
        g_a1[1][1] = "J.K Rowling";
        g_a1[1][2] = 12500;
        g_a1[2][0] = g_a[2];
        g_a1[2][1] = "Emilio Sánchez de Amo";
        g_a1[2][2] = 6500;
    
        g_cf[0] = "Star Wars";
        g_cf[1] = "La Guerra de los Mundos";
        g_cf[2] = "Soy Leyenda";
        g_cf1[0][0] = g_cf[0];
        g_cf1[0][1] = "John Jackson Miller";
        g_cf1[0][2] = 12500;
        g_cf1[1][0] = g_cf[1];
        g_cf1[1][1] = "H. G. Wells";
        g_cf1[1][2] = 8900;
        g_cf1[2][0] = g_cf[2];
        g_cf1[2][1] = "Richard Matheson";
        g_cf1[2][2] = 6900;
    
    
        g_ch[0] = "Rapunzel";
        g_ch[1] = "Blanca Nieves";
        g_ch[2] = "El Patito Feo";
        g_ch1[0][0] = g_ch[0];
        g_ch1[0][1] = "Hermanos Grimm";
        g_ch1[0][2] = 4500;
        g_ch1[1][0] = g_ch[1];
        g_ch1[1][1] = "Jacob Grimm";
        g_ch1[1][2] = 8900;
        g_ch1[2][0] = g_ch[2];
        g_ch1[2][1] = "Hans Andersen";
        g_ch1[2][2] = 5000;
    
    
        g_g[0] = "Frankenstein";
        g_g[1] = "El Monje";
        g_g[2] = "El Fantasma de la ópera";
        g_g1[0][0] = g_g[0];
        g_g1[0][1] = "Mary Shelly";
        g_g1[0][2] = 12500;
        g_g1[1][0] = g_g[1];
        g_g1[1][1] = "Matthew Lewis";
        g_g1[1][2] = 8900;
        g_g1[2][0] = g_g[2];
        g_g1[2][1] = "Gast[on Leroux";
        g_g1[2][2] = 6900;
    
    
        g_pl[0] = "No cierres los ojos";
        g_pl[1] = "La pareja de al lado";
        g_pl[2] = "La tristeza del Samurai";
        g_pl1[0][0] = g_pl[0];
        g_pl1[0][1] = "T. R. Ragan";
        g_pl1[0][2] = 8500;
        g_pl1[1][0] = g_pl[1];
        g_pl1[1][1] = "Shari Lapena";
        g_pl1[1][2] = 8900;
        g_pl1[2][0] = g_pl[2];
        g_pl1[2][1] = "Víctor del Árbol";
        g_pl1[2][2] = 6900;
    
    
        g_pa[0] = "Alados";
        g_pa[1] = "Sobrenatural";
        g_pa[2] = "Pasaje al Misterio";
        g_pa1[0][0] = g_pa[0];
        g_pa1[0][1] = "Blake Pierce";
        g_pa1[0][2] = 8500;
        g_pa1[1][0] = g_pa[1];
        g_pa1[1][1] = "Joe Dispenza";
        g_pa1[1][2] = 5900;
        g_pa1[2][0] = g_pa[2];
        g_pa1[2][1] = "Francisco Renedo";
        g_pa1[2][2] = 5900;
    
    
        g_f[0] = "Los Jardines de la Luna";
        g_f[1] = "Todas las Hadas del Reino";
        g_f[2] = "El Camino de las Sombras";
        g_f1[0][0] = g_f[0];
        g_f1[0][1] = "Steven Ericksen";
        g_f1[0][2] = 8500;
        g_f1[1][0] = g_f[1];
        g_f1[1][1] = "Laura Gallego";
        g_f1[1][2] = 8900;
        g_f1[2][0] = g_f[2];
        g_f1[2][1] = "Brent Weeks";
        g_f1[2][2] = 6900;

               
    do {    
        System.out.println("Digite el género: \n1. Aventura \n2. Ciencia Ficción \n3. Cuentos de Hadas \n4. Gótica \n5. Policiaca"
                + "\n6. Paranormal \n7. Fantástica");
        int gen = leer.nextInt(); 
        
        switch(gen) {
            case 1:
                System.out.println("Digite el libro que desea: ");
                libro = leer.nextLine();
                leer.nextLine();

                for(i=0; i<g_a.length; i++) {
                            
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_a[i])) {
                        esta = true;
                        System.out.println("Libro: "+g_a[i]+ "\n. Autor: "+g_a1[i][1]+" \n. Precio: "+g_a1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio;  
                            
                            /*if (g_a[i].equalsIgnoreCase(g_a[0])) {
                                compraLV.cant_a1_v--;
                            }//fin if
                            else if (g_a[i].equalsIgnoreCase(g_a[1])) {
                                compraLV.cant_a2_v--;
                            }//fin if
                            else if (g_a[i].equalsIgnoreCase(g_a[2])) {
                                compraLV.cant_a3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
            case 2:
                System.out.println("Digite el libro que desea: ");
                libro = leer.nextLine();
                leer.nextLine();                
                for(i=0; i<g_cf.length; i++) {
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_cf[i])) {
                        System.out.println("Libro: "+g_cf[i]+ "\n. Autor: "+g_cf1[i][1]+" \n. Precio: "+g_cf1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio;
                            
                            /*if (g_cf[i].equalsIgnoreCase(g_cf[0])) {
                                compraLV.cant_cf1_v--;
                            }//fin if
                            else if (g_cf[i].equalsIgnoreCase(g_cf[1])) {
                                compraLV.cant_cf2_v--;
                            }//fin if
                            else if (g_cf[i].equalsIgnoreCase(g_cf[2])) {
                                compraLV.cant_cf3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
            case 3:
                for(i=0; i<g_ch.length; i++) {
                    System.out.println("Digite el libro que desea: ");
                    libro = leer.nextLine();
                    leer.nextLine();
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_ch[i])) {
                        System.out.println("Libro: "+g_ch[i]+ "\n. Autor: "+g_ch1[i][1]+" \n. Precio: "+g_ch1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio; 
                            
                            /*if (g_ch[i].equalsIgnoreCase(g_ch[0])) {
                                compraLV.cant_ch1_v--;
                            }//fin if
                            else if (g_ch[i].equalsIgnoreCase(g_ch[1])) {
                                compraLV.cant_ch2_v--;
                            }//fin if
                            else if (g_ch[i].equalsIgnoreCase(g_ch[2])) {
                                compraLV.cant_ch3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
            case 4:
                for(i=0; i<g_g.length; i++) {
                    System.out.println("Digite el libro que desea: ");
                    libro = leer.nextLine();
                    leer.nextLine();
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_g[i])) {
                        System.out.println("Libro: "+g_g[i]+ "\n. Autor: "+g_g1[i][1]+" \n. Precio: "+g_g1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio;
                            
                            /*if (g_g[i].equalsIgnoreCase(g_g[0])) {
                                compraLV.cant_g1_v--;
                            }//fin if
                            else if (g_g[i].equalsIgnoreCase(g_g[1])) {
                                compraLV.cant_g2_v--;
                            }//fin if
                            else if (g_g[i].equalsIgnoreCase(g_g[2])) {
                                compraLV.cant_g3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;
            case 5:
                for(i=0; i<g_pl1.length; i++) {
                    System.out.println("Digite el libro que desea: ");
                    libro = leer.nextLine();
                    leer.nextLine();
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_pl[i])) {
                        System.out.println("Libro: "+g_pl[i]+ "\n. Autor: "+g_pl1[i][1]+" \n. Precio: "+g_pl1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio; 
                            
                            /*if (g_pl[i].equalsIgnoreCase(g_pl[0])) {
                                compraLV.cant_pl1_v--;
                            }//fin if
                            else if (g_pl[i].equalsIgnoreCase(g_pl[1])) {
                                compraLV.cant_pl2_v--;
                            }//fin if
                            if (g_pl[i].equalsIgnoreCase(g_pl[2])) {
                                compraLV.cant_pl3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
            case 6:
                for(i=0; i<g_pa.length; i++) {
                    System.out.println("Digite el libro que desea: ");
                    libro = leer.nextLine();
                    leer.nextLine();
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_pa[i])) {
                        System.out.println("Libro: "+g_pa[i]+ "\n. Autor: "+g_pa1[i][1]+" \n. Precio: "+g_pa1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio;   
                            
                            /*if (g_pa[i].equalsIgnoreCase(g_pa[0])) {
                                compraLV.cant_pa1_v--;
                            }//fin if
                            else if (g_pa[i].equalsIgnoreCase(g_pa[1])) {
                                compraLV.cant_pa2_v--;
                            }//fin if
                            if (g_pa[i].equalsIgnoreCase(g_pa[2])) {
                                compraLV.cant_pa3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
            case 7:
                for(i=0; i<g_f.length; i++) {
                    System.out.println("Digite el libro que desea: ");
                    libro = leer.nextLine();
                    leer.nextLine();
        
                opcion = 0;
                        
                    if(libro.equalsIgnoreCase(g_f[i])) {
                        System.out.println("Libro: "+g_f[i]+ "\n. Autor: "+g_f1[i][1]+" \n. Precio: "+g_f1[i][2]);
           
                        System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                        opcion = leer.nextInt();
        
        //pago: objeto para mostrar las variables de la clase Carrito   
                        if(opcion==1) {
                            pago.SumProduct +=pago.precio;   
                            
                            /*if (g_f[i].equalsIgnoreCase(g_f[0])) {
                                compraLV.cant_f1_v--;
                            }//fin if
                            else if (g_f[i].equalsIgnoreCase(g_f[1])) {
                                compraLV.cant_f2_v--;
                            }//fin if
                            if (g_f[i].equalsIgnoreCase(g_f[2])) {
                                compraLV.cant_f3_v--;
                            }//fin if*/
                        }//fin if                   
                    }//fin if  
                }//fin for
            break;    
                        
        }//fin switch
        
        if (esta==false) {
            System.out.println("Libro no disponible");
            System.out.println("¿Desea encargarlo? \n1. Sí \n2. No ");
            encarg = leer.nextInt();
            
            if(encarg==1) {
                System.out.println("Digite la siguiente información del libro que desea solicitar: ");
                System.out.println("1. Nombre del libro\n"+"2. Nombre del autor \n"+"3. Año de publicación\n");   
                for(int x=0;x<arrayProduct.length;x++){
                    arrayProduct[x]=leer.nextLine();
                }//fin for
                System.out.println("Felicidades, su solicitud para el libro "+arrayProduct[1]+ " se procesó exitosamente");
            }//fin if
        }//fin if
        
       System.out.println("Continuar comprando: \n1. Sí \n2. No");
       opcion = leer.nextInt();
       
    }while(opcion!=2); 
    
    if(esta==true) {
        System.out.println("Envío: 1 \n Recoger en tienda: 2");
        int opc = leer.nextInt();
        if(opc==1){
            envdom.totalEnvio();
        }//fin if
       
    }//fin if
    
    }//fin Comprar

    //constructor
    public Producto() {
    }//fin cosntructor
       
}//fin Producto    



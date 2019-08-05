/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;
import java.util.Arrays;
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
    
    
    public void Categoria() {   
        
        //Por el momento funciona la opción 1
        int elegir = 0;
        System.out.println("Agregar Inventario: \n1. Libros Venta \n2. Libros Préstamo \n3. Accesorios"); 
        elegir = leer.nextInt();
        switch(elegir) {
            case 1: 
                //Por el momento funciona la opción 1, una vez terminada las otras opciones tienen la misma estructura
                System.out.println("Género: \n1. Novela \n2. Policiaco \n2. Terror");
                elegir = leer.nextInt();
                switch (elegir) {
                    case 1:
                        novela= new String[capac];
                        System.out.println("Cantidad de libros a agregar: ");
                        agregar = leer.nextInt();
                            if (agregar < capac) {
          //Acá está el problema de agregar los datos al final, sin borrar los que ya existen
                                capac -= i;
                                for(i=3; i<novela.length; i++) {
                                    String temp = "";
                                    System.out.println("Ingrese el título: ");
                                    temp = leer.nextLine();
                                    
                                    novela[i] = temp;                                    
                                    capac --;
                                    System.out.println("Posiciones disponibles: "+(capac));                                                                                                     
                                }//fin for                                   
                            }//fin if
                            else{
                                System.out.println("No hay espacio disponible para agregar libros");    
                            }//fin else                             
                    break;
                }//fin switch
        }//fin switch     
        
        System.out.println("Inventario libros: ");
        System.out.println(Arrays.toString(novela));
    }//Fin Categoria

    
    //Constructor para poder mostrar las variales en otras clases
    public Inventario() {
    }

    //get-set por si se deben mostrar estas variables en otras clases, sino luego se borran
    public String[] getNovela() {
        return novela;
    }

    public void setNovela(String[] novela) {
        this.novela = novela;
    }
    
}//fin Inventario

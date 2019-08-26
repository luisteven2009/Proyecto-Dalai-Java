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
public class Producto {
    
    //atributos privados (encapsulación)
    private Scanner leer = new Scanner(System.in);
    private Inventario invent = new Inventario();
    private Carrito pago = new Carrito();
    private EnvioDomicilio envdom = new EnvioDomicilio(pago);

    private String[] arrayProduct = new String[4];
    private String[] formularioLibroNuevo = new String[]{};
    private int opcion = 0;
    private int encarg = 0;
    private String libro;
    private boolean esta = false;
    private int result;

    private Libro [] libros = new Libro[21];
    
    
    /*manipulación de la información como objetos
    cada título con su autor y precio
    */
    //constructor
    public Producto(){
        libros[0] = new Libro("La Odisea","Homero","Aventura", 5900); //inicialización de cada atributo de la clase Libro
        libros[1] = new Libro("Harry Potter","J.K Rowling","Aventura", 12500);
        libros[2] = new Libro("Hojas perdidas","Emilio Sánchez de Amo","Aventura", 6500);

        libros[3] = new Libro("Star Wars","John Jackson Miller","Ciencia Ficción", 12500);
        libros[4] = new Libro("La Guerra de los Mundos", "H. G. Wells","Ciencia Ficción", 8900);
        libros[5] = new Libro("Soy Leyenda","Richard Matheson","Ciencia Ficción", 6900);

        libros[6] = new Libro("Rapunzel","Hermanos Grimm","Cuentos de Hadas", 4500);
        libros[7] = new Libro("Blanca Nieves","Jacob Grimm","Cuentos de Hadas", 8900);
        libros[8] = new Libro("El Patito Feo","Hans Andersen","Cuentos de Hadas", 5000);

        libros[9] = new Libro("Frankenstein","Mary Shelly","Gótica", 12500);
        libros[10] = new Libro("El Monje","Matthew Lewis","Gótica", 8900);
        libros[11] = new Libro("El Fantasma de la ópera","Gastón Leroux","Gótica", 6900);

        libros[12] = new Libro("No cierres los ojos","T. R. Ragan","Policiaca", 8500);
        libros[13] = new Libro("La pareja de al lado","Shari Lapena","Policiaca", 8900);
        libros[14] = new Libro("La tristeza del Samurai","Víctor del Arbol","Policiaca", 6900);

        libros[15] = new Libro("Alados","Blake Pierce","Paranormal", 8500);
        libros[16] = new Libro("Sobrenatural","Joe Dispenza","Paranormal", 5900);
        libros[17] = new Libro("Pasaje al Misterio","Francisco Renedo","Paranormal", 5900);

        libros[18] = new Libro("Los Jardines de la Luna","Steven Ericksen","Fantástica", 8500);
        libros[19] = new Libro("Todas las Hadas del Reino","Laura Gallego","Fantástica", 8900);
        libros[20] = new Libro("El Camino de las Sombras","Brent Weeks","Fantástica", 6900); 
        
    }//fin constructor
    
    
    //método para poder recorrer los géneros e imprimir la información asociada al libro
    private int leerGen(int gen){
        System.out.println("Digite el libro que desea: ");
        leer = new Scanner(System.in);
        libro = leer.nextLine();
        
        /*gen es donde se guarda el número del género que se digita en el menú del do-while pero ese menu comienza en 1 con 
        Aventura, por eso en el for es gen-1 para que índice inicialice en 0. El *3 es porque cada género tiene 3 índices dentro del vector de objetos 
        que en total tiene 21 posiciones. Multiplicar ese 3 garantiza que se van a leer solo las 3 posiciones del género que se digitó
        Por ejemplo, si yo digito género 2, índice=1*3, entonces se saltaría las primeras 3 posiciones del vector que corresponden a Aventura
        */        
        for(int indice = (gen-1)*3; indice < gen*3; indice++){
            if(libro.equalsIgnoreCase(libros[indice].getNombre())) {
                esta = true;
                System.out.println("Libro: "+libros[indice].getNombre()+ "\n. Autor: "+libros[indice].getAutor()+" \n. Género: "+libros[indice].getGenero()+" \n. Precio: ¢"+libros[indice].getPrecio());
                System.out.println("Desea agregarlo al carrito: \n1. Sí \n2. No" );
                opcion = leer.nextInt();
                if(opcion==1) {
                    pago.añadirPrecio(libros[indice].getPrecio()); //se ejecuta el método añadirPrecio de la clase Carrito pero solo la última variable referente al precio. Como es privada se usa el get               
                    //cada vez que se agrega un libro a carrito se resta del inventario  
                    return indice%3;
                }//fin if                   
            }//fin if
        }//fin for
        return -1; //método tipo int
    }//fin switchCase

    public void comprar() {

        do {    
            System.out.println("Digite el género: \n1. Aventura \n2. Ciencia Ficción \n3. Cuentos de Hadas \n4. Gótica \n5. Policiaca"
                + "\n6. Paranormal \n7. Fantástica");
            int gen = leer.nextInt(); 

            switch(gen) {
                case 1:
                    result = leerGen(gen); //en result se almacena el método que recorre todo el vector por medio del for
                    if(result != -1){ //el -1 es el retorno del método leerGen (cuando da error) entonces cuando result es diferente que ese retorno,
                        invent.restar_aventura_v(result); //se ejecuta el respectivo método para restar la cantidad
                    }//fin if
                    break;    
                case 2:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_ciencia_v(result);
                    }//fin if
                    break;    
                case 3:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_cuentos_v(result);
                    }//fin if
                    break;    
                case 4:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_fantastica_v(result);
                    }//fin if
                    break;
                case 5:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_gotico_v(result);
                    }//fin if
                    break;    
                case 6:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_paranormal_v(result);
                    }//fin if
                    break;    
                case 7:
                    result = leerGen(gen);
                    if(result != -1){
                        invent.restar_policiaca_v(result);
                    }//fin if
                    break;

            }//fin switch

            //bandera booleana, si el libro no está su estado no cambia y se imprime "no disponible"
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
        
        //cambio de estado en la bandera booleana indica que el libro se añadió al carrito
        if(esta==true) {
            System.out.println("-----Información Pick up-----");
            System.out.println(".Envío a Domicilio: 1 \n.Recoger en tienda: 2 \n.Rentar: 3");
            int opc = leer.nextInt();
            if(opc==1){
                envdom.totalEnvio();
            }//fin if  
            else if(opc==2){
                System.out.println("El precio total es de: ¢"+pago.getCuenta());
            }//fin if 2
            else{
                System.out.println("Aviso! \nEl libro será prestado por un lapso de 7 dias. \nCada dia extra se cobrará un extra de ¢1000");
                System.out.println("El precio total a pagar en este momento es de: ¢"+pago.getCuenta());
            }
        }//fin if

    }//fin Comprar

}//fin Producto    



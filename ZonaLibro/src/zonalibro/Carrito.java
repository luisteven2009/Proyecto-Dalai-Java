/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;

/**
 *
 * @author WUM
 */
class Carrito {
    
    private int cuentaTotal = 0;
    
    //Constructor
    public Carrito() {
        cuentaTotal = 0;
    }//fin contructor
    
    //método para ir sumando los libros que se agreguen, entra como parámetro el precio de cada libro
    public void añadirPrecio(int precio){
        cuentaTotal += precio;
    }//fin añadirPrecio
    
    public int getCuenta(){
        return cuentaTotal;
    }//fin get
          
}//fin Carrito

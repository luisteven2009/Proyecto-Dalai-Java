/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonalibro;

/**
 *
 * @author Usuario
 */
class Carrito {
    int precio = 7995;
    int SumProduct = 0;
    public void Total() {
//        SumProduct +=precio;  
        System.out.println("El monto a pagar es de: ₡"+precio);
    }//fin Pago

    
    //Constructor
    public Carrito() {
        
    }

       
    //get-set
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getSumProduct() {
        return SumProduct;
    }

    public void setSumProduct(int SumProduct) {
        this.SumProduct = SumProduct;
    }

    
    
}//fin Carrito

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
//Clase para poder manejar los atributos de cada libro
public class Libro {
    
    private String nombre;
    private String autor;
    private int precio;
    private String genero;
    
    //constructor
    public Libro(String nombre, String autor, String genero, int precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.genero = genero;
    }//fin constructor
    
    
    public int getPrecio(){
        return precio;
    }//fin getPrecio
    
    public String getNombre(){
        return nombre;
    }//fin getNombre
    
    public String getAutor(){
        return autor;
    }//fin getAutor

    public String getGenero() {
        return genero;
    }//fin getGenero
    
    
}//fin Libro

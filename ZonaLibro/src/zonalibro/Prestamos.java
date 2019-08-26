
package zonalibro;

/*
 Objetivo es crear un metodo que funciona para los prestamos usando un contador que dira cuando el tiempo de prestamo haya vencido
 */
import javax.swing.JOptionPane;
public class Prestamos {
    
    
    private void prestamo(){
        JOptionPane.showMessageDialog(null, "Bienvenido a la seccion de prestamos de ZonaLibro", "Aviso", 1);
        Inventario invent = new Inventario();
        String resp = JOptionPane.showInputDialog(null, "Indique el nombre del libro que desea rentar", "Pregunta", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }//fin metodo prestamo
    
}//fin clase Prestamos

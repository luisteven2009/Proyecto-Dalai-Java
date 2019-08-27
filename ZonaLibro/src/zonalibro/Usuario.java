/*
 * Clase donde se ingresan los datos del cliente para asi crear una cuenta
 * La misma sirve para iniciar sesion
 */
package zonalibro;

import java.util.Scanner;
public class Usuario {
    
    
    Scanner leer = new Scanner(System.in);
    
    String[] arrayProfile = new String[6];
    
    public void Registro(){
        /*Estructura del array
         1. nombre completo
         2. nombre de usuario
         3. correo electronico
         4. contraseña
         5. direccion fisica
         6. num id
        */
        
           
        System.out.println("Por favor ingrese los datos solicitados en el siguiente orden:");
        System.out.println("1. Nombre completo\n" +
            "2. Nombre de usuario\n" +
            "3. Correo electrónico\n" +
            "4. Contraseña\n" +
            "5. Dirección física\n" +
            "6. Num id");
        
        for(int i=0;i<arrayProfile.length;i++){
            arrayProfile[i]=leer.nextLine();
        }//fin for ingreso de datos
        
        System.out.println("Felicidades "+arrayProfile[1]+", su cuenta se ha creado exitosamente!");
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Te damos la bienvenida con un regalo sorpresa!! \nElige un numero del 1 al 5");
        int regalo=0;
        regalo = leer.nextInt();
        switch(regalo){
            case 1:
                System.out.println("Haz ganado el libro de Harry Potter");
                break;
            case 2:
                System.out.println("Haz ganado una BOTELLA CLIMA STRIPES 500ML");
                break;
            case 3:
                System.out.println("Haz ganado COSTA RICA MAP, un libro de National Geographic");
                break;
            case 4:
                System.out.println("Haz ganado un separalibros a escoger con tu proxima compra de un libro");
                break;
            case 5:
                System.out.println("Haz ganado un notebook");
                break;
        
        }//fin switch
        System.out.println("---------------------------------------------------------");
        
    }//fin method Registro
    
    public void inicioSesion(){
        System.out.println("INICIO DE SESION DE USUARIO");
        System.out.println("Ingrese su Nombre de Usuario");
        String respUserN = leer.next();
        
        if (respUserN.equals(arrayProfile[1])){  
            System.out.println("Ingrese su Contraseña");
            String respUserP = leer.next();
            if (respUserP.equals(arrayProfile[3])){  
                System.out.println("Inicio de sesion exitoso!!");
          } 
        } 
        else{
            System.out.println("Datos incorrectos, por favor reviselos e intente nuevamente");
        }
    }// fin method inicioSesion
    
}//fin class Usuario

/*
 * Clase donde se ingresan los datos del cliente para asi crear una cuenta
 * La misma sirve para iniciar sesion
 */
package zonalibro;

import java.util.Scanner;
public class Usuario {
    
    
    Scanner leer = new Scanner(System.in);
    
    String[] arrayProfile = new String[5];
    String[] accoutAlreadyCreated = new String[]{"", "JuanPerez", "", "password"};
    
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
        System.out.println("1. nombre completo\n" +
            "2. nombre de usuario\n" +
            "3. correo electronico\n" +
            "4. contraseña\n" +
            "5. direccion fisica\n" +
            "6. num id");
        
        for(int i=0;i<arrayProfile.length;i++){
            arrayProfile[i]=leer.nextLine();
        }//fin for ingreso de datos
        
        System.out.println("Felicidades "+arrayProfile[1]+", su cuenta se ha creado exitosamente");
        
    }//fin method Registro
    
    public void inicioSesion(){
        System.out.println("Ingrese su Nombre de Usuario");
        arrayProfile[2] = leer.nextLine();
        
        if (arrayProfile[1].equalsIgnoreCase(accoutAlreadyCreated[1])){  
            System.out.println("Ingrese su Contraseña");
            arrayProfile[3] = leer.nextLine();
            if (arrayProfile[3].equalsIgnoreCase(accoutAlreadyCreated[3])){  
                System.out.println("Inicio de sesion exitoso!!");
          } 
        } 
        else{
            System.out.println("Datos incorrectos, por favor reviselos e intente nuevamente");
        }
    }// fin method inicioSesion
    
}//fin class Usuario

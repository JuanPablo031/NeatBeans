/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
      //si no mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
      
      String frase;
      
     
      
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese la contraseña");
        frase = leer.next();
        
        if (frase.equals("eureka")) { 
        
        System.out.println("CORRECTO");
       }else { 
        System.out.println("INCORRECTO");
        
        
            
        
        }
    }
      
      }
      

        
    
    


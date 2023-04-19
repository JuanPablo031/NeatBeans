/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Lenght() en Java.*/
      
      String frase;
      Scanner leer = new Scanner(System.in);
      
      
        System.out.println("Ingrese una frase de 8 letras");
        frase = leer.nextLine();
        
      
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
            
            
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.clase.pkg2;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author blanc
 */
public class Ejercicio3Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     String frase ;
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in); 
        
        frase = leer.nextLine();
        
        System.out.println("La frase en mayusculas es:" +toUpperCase(frase));
        System.out.println("La frase en minusculas es:" +toLowerCase(frase));
        
    }
    
}

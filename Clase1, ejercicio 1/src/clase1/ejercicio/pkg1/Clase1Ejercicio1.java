/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase1Ejercicio1 {
/**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
    El programa deberá después mostrar el resultado de la suma
*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num1,num2,numFinal;
        
        System.out.println("Ingrese 2 numeros enteros que quiera sumar:");
        Scanner leer = new Scanner (System.in);
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        numFinal = num1 + num2;
        System.out.println("El resultado de los dos numeros es:" +numFinal);
    
    }
    
}

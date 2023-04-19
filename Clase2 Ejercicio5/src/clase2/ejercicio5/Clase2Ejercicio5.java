/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
       //el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().


int num;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        System.out.println("El doble del numero ingresado es:" +(num * 2));   
        System.out.println("El triple del numero ingresado es:"+(num * 3 ));
        System.out.println("El cuadrado del numero ingresado es:"+Math.sqrt(num));
          
      
        
        
    }
    
}

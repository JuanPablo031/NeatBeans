/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4.ejercicio.pkg4;


import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Crea una aplicación que nos pida un número por teclado y 
con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/
       
        int num1;
        Scanner leer = new Scanner (System.in);
         System.out.println("Ingrese un numero primo");
         num1 = leer.nextInt();

         Primo (num1);
     }
     public static void Primo(int num1){
         int contador, i;
         contador = 0;
         for (i = 1; i < num1; i++) {
             if (num1 % i == 0) {
                 contador++;
             } 
         }
         if (contador < 2) {
             System.out.println("Es primo");
         } else {
             System.out.println("No es primo");
         }
    }
}

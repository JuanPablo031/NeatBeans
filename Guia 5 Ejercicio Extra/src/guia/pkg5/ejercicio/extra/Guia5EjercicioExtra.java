/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.extra;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5EjercicioExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.*/
        int tamaño, suma = 0;
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese de que tamaño quiere el vector");
        tamaño = leer.nextInt();
         int [] vector = new int [tamaño];
         
         for (int i = 0; i < tamaño; i++) {
             System.out.println("Ingrese un numero");
             vector [i] = leer.nextInt();
             suma = suma + vector[i];
        }
         System.out.println(" La suma de los numeros ingresados es: "+suma);
         for (int i = 0; i < tamaño; i++) {
             System.out.print(vector[i]);
        }
    }
    
}

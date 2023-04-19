/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicios.pkg1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5Ejercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.*/
         Scanner leer= new Scanner(System.in);
        int[] vector;
        vector= new int[100];
        int[]numero= new int[100];
            
        for (int i = 99; i >-1; i--) {
            vector[i]=i;
            System.out.println(vector[i]);
            
        }
    }
    
}

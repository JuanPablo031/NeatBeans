/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args) {
        // TODO code application logic here
       /* Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido*/
       int tam, contador = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño");
        tam = leer.nextInt();
       int[] vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            vector[i] = (int)(Math.random()* 10);
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Ingrese el numero que desea buscar");
        int num1 = leer.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (num1 == vector[i] ) {
                contador++;
                System.out.println("El numero se encontro en el subindice: "+i);
            } 
            
        }
        if (contador == 0) {
            System.out.println("no se encontro");
        }else if (contador >= 1){
            System.out.println("El numero se encontro: " +contador+ " cantidad de veces");
        }
        
    }
    
    
}

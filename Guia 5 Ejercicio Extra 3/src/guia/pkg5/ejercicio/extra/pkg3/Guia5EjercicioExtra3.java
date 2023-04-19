/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] vector;
        int tamaño;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();
        
        vector = new int [tamaño];
        
        cargar(vector);
   mostrar(vector);
}

    public static void cargar (int [] vector ){
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (int) (Math.random() * 10) ;
           
        }
    }
    public static void mostrar (int [] vector ){
        for (int i = 0; i < vector.length ; i++) {
            System.out.print(vector [i]);  
          
        }
        System.out.println(" ");
    }
        
        
        
    }
}


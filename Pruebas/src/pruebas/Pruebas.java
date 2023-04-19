/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;



/**
 *
 * @author blanc
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.*/
    int tamano;
    Scanner leer = new Scanner(System.in);}
    
    tamano = leer.nextInt();
    
    int [] vector = new int [tamano];
    
    
        cargar (vector);
    
}
    

   
          
public static void cargar (int[] vector){

for (i = 0; i < vector.length; i++){

vector [i] = (int) (Math.random()* 10);
}
}

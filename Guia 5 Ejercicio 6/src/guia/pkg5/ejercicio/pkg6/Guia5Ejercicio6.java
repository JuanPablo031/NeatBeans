/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg6;

import java.util.Scanner;



/**
 *
 * @author blanc
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9. */
        
        int [][] matriz = new int [3][3];
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese 9 numeros del 1 al 9");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz [i][j] = leer.nextInt();
                while (matriz [i][j] >= 1 && matriz [i][j] <= 9) {
                 
                        System.out.println("Hola paso" ); break;
                }
                if (matriz [i][j]  < 0 && matriz [i][j] > 9) {
                    System.out.println("Ingrese numeros del 1 al 9");
                }
                
                        
                
                   }
                
                }
                
            }
        }
         
        


        
        
              
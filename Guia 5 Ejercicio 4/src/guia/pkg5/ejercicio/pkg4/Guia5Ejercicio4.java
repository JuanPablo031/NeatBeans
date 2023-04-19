/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/
        
       
        int [][] matriz = new int [4][4] ; 
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                 matriz [i][j] = (int) (Math.random() * 10);
           
                System.out.print( matriz [i][j]+ " ");
            }     
        System.out.println();
        }
              System.out.println(" ");      
            
             int [][] matriz2 = new int [4][4] ; 
      
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2 [j][i] =  matriz [i][j] ;
                System.out.print( matriz [j][j]+ " ");
            }
            System.out.println();
            
        }
        }   
    }


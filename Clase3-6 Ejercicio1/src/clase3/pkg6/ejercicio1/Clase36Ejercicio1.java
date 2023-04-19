/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un programa que dado un número determine si es par o impar.
        
        Scanner leer = new Scanner(System.in);
        
        int num1;

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        
        if (num1 % 2 == 0){
            System.out.println(num1+ " es un numero par");
             }
            else {
        System.out.println(num1+ " es un numero impar");
        
        } 
         }
     } 
 
  
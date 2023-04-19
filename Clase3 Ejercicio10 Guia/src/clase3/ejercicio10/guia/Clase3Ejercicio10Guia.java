/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.ejercicio10.guia;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase3Ejercicio10Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
        
       int num1,num2,num3,num4,i;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 4 numeros entre 1 y 20");
        
        num1=leer.nextInt();
               num2=leer.nextInt();
               num3=leer.nextInt();
               num4=leer.nextInt();
                
                System.out.print(num1);
                for (i=1;i<=num1;i++){
                    
                    
                    System.out.print( "*" );
                    
                    }
                System.out.println(" ");
                  System.out.print(num2);
                    for (i=1;i<=num2;i++){
                      
                        System.out.print("*");
                
                   }
                    System.out.println(" ");
                      System.out.print(num3);
                      
                        for (i=1;i<=num3;i++){
                          
                            System.out.print("*");
                       
                       }
                        System.out.println(" ");
                         System.out.print(num4);
                       for  (i=1;i<=num4;i++){
                          
                           System.out.print("*");
                           
                    }
                       System.out.println(" ");
                    }
        }
                
                
    
   
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
    */
        System.out.println("ingresar cantidad de asteriscos de un lado");
               
 
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese un numero");
        //int n = leer.nextInt();
        int n = 9;
        for (int i = 0; i < n; i++) {
            //String simbolo = "*";
            //System.out.print("*");
            for (int j = 0; j < n; j++) {
                
                if( i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");  
                }
               
            }
            System.out.println("");
        }
        
        
    }
    
}

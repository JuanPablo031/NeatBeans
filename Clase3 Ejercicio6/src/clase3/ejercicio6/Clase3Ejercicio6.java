    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Implementar un programa que le pida dos números enteros al usuario 
       //y determine si ambos o alguno de ellos es mayor a 25.
       
       int num1,num2;
        System.out.println("Ingrese 2 numero enteros");
        Scanner leer = new Scanner(System.in);
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25  || num2 > 25){
            System.out.println("Algun numero ingresado es mayor a 25");
            
        }else{
            System.out.println("Ningun numero ingresado es mayor a 25");
        }

    }
    

}
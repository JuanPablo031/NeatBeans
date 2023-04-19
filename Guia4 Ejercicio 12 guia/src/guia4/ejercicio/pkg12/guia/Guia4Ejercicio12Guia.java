/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4.ejercicio.pkg12.guia;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia4Ejercicio12Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.*/
       
       int num1,num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros");
        num1= leer.nextInt();
        num2 = leer.nextInt();
       
        EsMultiplo(num1,num2);
       
    }
   
    public static void EsMultiplo(int num1, int num2) {
        
        if (num1 % num2 == 0){
            System.out.println("El " +num1+ " es multiplo de:"+num2);
            
        }else{
            System.out.println("no son multiplos");
        }
        
        
        
}
}
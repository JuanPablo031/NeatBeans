/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3.pkg6.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
       
       int num1,suma, limite;
       
       Scanner leer = new Scanner(System.in);
        System.out.println("Cual quiere que sea el limite?");
        limite = leer.nextInt();
       
        suma = 0;
        while (suma < limite){
        System.out.println(" Ingrese un numero");
        num1 = leer.nextInt();
        
        suma = suma + num1;
    
    }
        System.out.println("El numero llego o paso al limite y la suma de los numeros ingresados es:"+suma);
    }
}

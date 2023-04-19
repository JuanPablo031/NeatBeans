/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.ejercicio9.guia;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase3Ejercicio9Guia {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        /*Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje
"Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
        
Scanner teclado = new Scanner (System.in);
        int num , cont  , suma;
        cont = 1;
        suma = 0;
        do {
        System.out.println("Nº"+ cont +" Ingresar número:");
        num = teclado.nextInt();
        if (num > 0) {
            suma = suma + num;
        } else if (num == 0){
            System.out.println("Se capturó el número cero.");
            break;
        }
        cont = cont + 1;     
        } while (num != 0 && cont <= 20);
        
        System.out.println("La suma de los números positivos es = "+suma);
        
    }
}

    
    

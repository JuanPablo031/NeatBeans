/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. */
       
       
       int num1,num2,opcion;
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        System.out.println("Seleccione la opcion que quiere realizar: \n 1) Sumar \n 2) Restar \n 3) Multiplicar \n 4) Dividir");
        opcion = leer.nextInt();
        
       switch (opcion) {
            case 1: 
            System.out.println("Resultado igual:" +Suma(num1,num2));
                break;
                case 2:
                   System.out.println("Resultado igual:" +Resta(num1,num2));
                    break;
                    case 3:
                        System.out.println("Resultado igual:" +Multiplicar(num1,num2));
                        break;
                        case 4:
                            System.out.println("Resultado igual:" +Dividir(num1,num2));
                break;
            default:
                System.out.println("Error");
       }
    }
     
     public static int Suma  (int num1, int num2) {
         
         return num1 + num2;   
     }
     public static int Resta  (int num1, int num2) {
         
         return num1 - num2;
     }
     public static int Multiplicar  (int num1, int num2) {
         
         return num1 * num2;
     }
     public static int Dividir  (int num1, int num2) {
         
         return num1 / num2;
     }
}

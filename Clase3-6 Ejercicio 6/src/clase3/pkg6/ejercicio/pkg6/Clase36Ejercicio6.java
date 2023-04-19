/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
        El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
        en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
        caso contrario se vuelve a mostrar el menú. */
        
        Scanner leer2 = new Scanner(System.in);
        int num1,num2,opc;
        char salir;
        System.out.println("ingrese un numero");
        num1 = leer2.nextInt();
        System.out.println("ingrese un numero");
        num2 = leer2.nextInt();
        do {
            System.out.println("Menu:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija Opcion:");
            opc = leer2.nextInt();
            
            switch (opc) {
                case 1:
                    
                    System.out.println("la suma es:"+ (num1+num2));

                    break;
                case 2:
                     System.out.println("la resta es:"+ (num1-num2));
                    break;
                case 3:
                    System.out.println("la multiplicacion es:"+ (num1*num2));
                    break;
                case 4:
                    System.out.println("la division es:"+ (num1/num2));
                    break;
                case 5:
                        System.out.println("¿Está seguro que desea salir del programa(S/N)?");
                        salir = leer2.next().charAt(0);
                        if (salir == 's' || salir == 'S' ) {
                        opc=6;
                    } 
                    break;
                default:
                    System.out.println("opcion erronea");
            }
                    
        } while (opc != 6 );
        
        

    }
    
}

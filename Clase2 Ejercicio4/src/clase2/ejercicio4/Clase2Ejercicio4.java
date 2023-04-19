/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase2Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double grados;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese algun grado centigrado");
        
        grados = leer.nextDouble();
        
        System.out.println("El numero centigrado que usted coloco, tranformado a Fahrenheit es:" + (32 + (9 * grados / 5))); 
        
 
                
        
        
    }
    
}

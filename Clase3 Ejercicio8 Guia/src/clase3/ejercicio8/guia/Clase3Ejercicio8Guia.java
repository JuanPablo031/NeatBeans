/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.ejercicio8.guia;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase3Ejercicio8Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Escriba un programa que valide si una nota está entre 0 y 10, 
       //sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

        int nota;
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese su nota");
        nota = leer.nextInt();
        
        while (nota > 10 || nota < 0){
            System.out.println("Su nota no es valida");
          nota = leer.nextInt();            
    }  
            System.out.println("Su nota si es valida");
               
    }
    
}

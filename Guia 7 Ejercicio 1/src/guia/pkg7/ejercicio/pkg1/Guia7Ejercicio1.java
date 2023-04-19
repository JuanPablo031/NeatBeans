/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg1;

import Entidad.InteriorLibro;
import java.util.Scanner;



/**
 *
 * @author blanc
 */
public class Guia7Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        InteriorLibro l1 = new InteriorLibro();
        
        
        System.out.println("Ingrese el Titulo");
        l1.Titulo = leer.next();
        
       System.out.println("Ingrese el Autor");
        l1.Autor = leer.next();
        
        System.out.println("Ingrese el numero de paginas");
         l1.Paginas = leer.nextInt();
         
         System.out.println("Ingrese el ISBN");
        l1.ISBN = leer.nextInt();
          
        System.out.println("El titulo es: " + l1.Titulo);
        System.out.println("El autor es: " + l1.Autor);
        System.out.println("El numero de paginas es: " + l1.Paginas);
        System.out.println("El codigo ISBN es: " + l1.ISBN);
               
        
    }
    
}

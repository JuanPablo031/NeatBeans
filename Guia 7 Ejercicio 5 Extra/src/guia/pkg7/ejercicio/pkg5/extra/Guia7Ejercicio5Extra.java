/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg5.extra;

import Entidad.Cancion;

/**
 *
 * @author blanc
 */
public class Guia7Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Cancion c1 = new Cancion();
    String Autor = c1.Autor();
    String cancion = c1.cancion();
    
        System.out.println("El autor de la cancion es: "+ Autor);
        System.out.println("El titulo de la cancion es: "+ cancion);
       
        
    }
    
    
}

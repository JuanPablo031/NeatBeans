/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo
y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.*/
        /*Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo*/

        
        String [] Equipo = new String [9];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingrese un nombre");
            Equipo[i] = leer.next();
            
        }
        
        for (int i = 0; i < 9; i++) {
            
            System.out.println(Equipo[i]);
        }
        

    }
    
}

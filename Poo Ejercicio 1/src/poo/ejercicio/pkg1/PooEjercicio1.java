/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.ejercicio.pkg1;

import Entidad.Persona;

/**
 *
 * @author blanc
 */
public class PooEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 20;
        p1.altura = 180;

        System.out.println("Su nombre es: " + p1.nombre);
        System.out.println("Su edad es: " + p1.edad + " años ");
        System.out.println("Su altura es de: " + p1.altura + " cm ");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8.ejercicio.guia;


import Servicio.service;

/**
 *
 * @author blanc
 */
public class Guia8EjercicioGuia {

    /**
     * @param args the command line arguments
     * Crea un método void que reciba un objeto tipo persona como parámetro 
     * y utilice el get para mostrar sus atributos. Llama ese método desde el main.

     */
   
         service e1 = new service ("Juan", 20);
 
         
public static void service (service service) {
      System.out.println("Nombre: " + service.getNombre());
      System.out.println("Edad: " + service.getEdad());
    }
    
    
    
}

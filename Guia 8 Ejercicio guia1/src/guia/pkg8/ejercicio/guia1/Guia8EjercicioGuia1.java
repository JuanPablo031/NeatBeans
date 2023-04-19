/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8.ejercicio.guia1;

import Servicio.PersonaService;







/**
 *
 * @author blanc
 */
public class Guia8EjercicioGuia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      PersonaService p1 = new PersonaService ("Juan",20);
    }
         
public static void PersonaService (PersonaService PersonaService) {
      System.out.println("Nombre: " + PersonaService.getNombre());
      System.out.println("Edad: " + PersonaService.getEdad());

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author blanc
 */
public class service {
    
   /* Crea un método void que reciba un objeto tipo persona como parámetro 
     * y utilice el get para mostrar sus atributos. Llama ese método desde el main.*/
    String nombre;
    int edad;

    
    
    
    
    public service (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    
   
    
}


}

   



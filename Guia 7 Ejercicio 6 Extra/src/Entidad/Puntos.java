/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Puntos {

    public double x1, x2, y1, y2;

    public void crearPuntos() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de X1");
        x1 = leer.nextDouble();
        System.out.println(" Ingrese el numero de Y1");
        y1 = leer.nextDouble();

        System.out.println("Ingrese el numero de X2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el numero de y2");
        y2 = leer.nextDouble();
       
    }

    
    public void Calculo(){
        
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)); 
        System.out.println(" la distancia es: "+ distancia);
        
    }
    
    
    
    
}

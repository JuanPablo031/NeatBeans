/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.ejercicio7.guia;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase3Ejercicio7Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int TipoMotor;
        
        System.out.println("Ingrese que tipo de motor es:");
        
        Scanner leer = new Scanner(System.in);
        TipoMotor = leer.nextInt();
        
        switch (TipoMotor){
            
            case 1:  System.out.println("La bomba es una bomba de agua");
            break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3: System.out.println("La bomba es una bomba de hormigón");
            break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default :
                    System.out.println("No existe un valor válido para tipo de bomba");

        }          
        
                
        
        
        
        
    }
    
}

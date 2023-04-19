/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;       
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 5 caracteres");
        
        do {
            
        cont1 = cont1 + 1   ; 
        String frase = leer.next();
        int cant = frase.length(); // holaa 5
        
        String Pcar = frase.substring(0,1); // h
        String Scar = frase.substring(cant -1,cant); // 4-5 a
        
        //System.out.println(cant);
        //System.out.println(Pcar);
        //System.out.println(Scar);
        
        if (cant == 5 && "x".equalsIgnoreCase(Pcar) && "o".equalsIgnoreCase(Scar)){
        System.out.println("Secuencia Correcta");
        cont2 = cont2 + 1; 
    } else {
            System.out.println("Secuencia Incorrecta");
            cont3 = cont3 + 1; }
        
        
    }while (cont1 < 5);
        
        System.out.println("Secuencias Correctas " + cont2);
        System.out.println("Secuencias Incorrectas " + cont3);
        
    }
    }
    


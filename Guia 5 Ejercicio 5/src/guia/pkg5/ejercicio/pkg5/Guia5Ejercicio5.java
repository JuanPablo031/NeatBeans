/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("escribe tamaño de la matriz");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("llenar la matriz, espacio " + (i + 1) + (j + 1));
                matriz[i][j] = leer.nextInt();

            }

        }
        System.out.println("matriz normal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("matriz transpuesta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
        boolean antisimetr = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == -matriz[j][i]) {
                    antisimetr = true;
                    
                }

            }
           

        }
         if (antisimetr == false) {
                System.out.println("matriz no es antisimetrica");
            }
            if (antisimetr == true) {
                System.out.println("matriz es antisimetrica");
            }
    }
    
}

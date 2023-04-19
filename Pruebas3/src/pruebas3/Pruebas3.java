/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas3;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Pruebas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector1 :");
        int N = leer.nextInt();
        int i;
        int cont = 0;
        int[] vector1 = new int[N];
        int[] vector2 = new int[N];

        for (i = 0; i < N; i++) {
            vector1[i] = (int) (Math.random() * 10 + 1);
            vector2[i] = (int) (Math.random() * 10 + 1);
        }
        for (i = 0; i < N; i++) {
            if (vector1[i] == vector2[i]) {

                cont = cont + 1;
            } else {
                System.out.println("los vectores son diferentes");
                break;
            }
            if (cont == N) {
                System.out.print("los vectores son iguales");
            }
}
    }
    
}

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
public class Rectangulo {

    public int lado1, lado2;

    public int calcularArea() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el lado 1 del rectangulo  cm:");
        lado1 = leer.nextInt();
        System.out.println("Ingrese el lado 2 del rectangulo en cm:");
        lado2 = leer.nextInt();

        int calculo = lado1 * lado2;
        return calculo;
    }

}

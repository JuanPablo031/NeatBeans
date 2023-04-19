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
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
        
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void numeros() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }

    public int suma() {

        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
        return suma;

    }

    public int restar() {
        int restar = numero1 - numero2;
        System.out.println("La resta es: " + restar);
        return restar;
    }

    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("ERROR: No es posible de multiplicar");

            return 0;
        } else {
            int multiplicacion = numero1 * numero2;
            System.out.println("La multiplicacion es: " + multiplicacion);

            return this.numero1 * this.numero2;
        }
    }
    
    

    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("ERROR: No es posible de dividir");
            return 0;
        } else {
            int division = numero1 / numero2;
            System.out.println("La division es: " + division);

            return (int) (float) this.numero1 / this.numero2;

        }
        
    }
}


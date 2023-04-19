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
public class Cuenta {
    
     public int saldo;
    public String titular;

    public void retirarDinero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        titular = leer.nextLine();

        saldo = 1000000000;

        System.out.println("Cuando dinero desea retirar:");
        int retiro = leer.nextInt();

        if (retiro > saldo) {
            System.out.println("Fondos insuficiente");
        } else {
            saldo = saldo - retiro;

        }
        System.out.println("Su saldo actual es: " + saldo);

    }


public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Cuenta c1 = new Cuenta();
        c1.retirarDinero();
}

}

    


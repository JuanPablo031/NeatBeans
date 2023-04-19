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
        System.out.println("Ingrese su usuario:");
        titular = leer.nextLine();
        saldo = 1000000;

        System.out.println("Ingrese la cantidad de dinero que desea retirar:");
        int retiro = leer.nextInt();
        System.out.println("Se retiro: " + retiro + " de su cuenta de banco");

        if (retiro > saldo) {
            System.out.println("No tene plata");

        } else {
            saldo = saldo - retiro;

        }
        System.out.println("Su saldo actual es: " + saldo);

    }

}

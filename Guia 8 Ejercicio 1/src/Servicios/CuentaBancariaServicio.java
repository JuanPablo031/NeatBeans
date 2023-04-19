/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import CuentaBancaria.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public double saldoActual = 1000;

    public CuentaBancaria CuentaBancariaServicio() {

        System.out.println("Ingrese su numero de cuenta:");
        int Cuenta = (leer.nextInt());
        System.out.println("Ingrese su DNI:");
        int DNI = (leer.nextInt());

        return new CuentaBancaria(Cuenta ,DNI);
    }

    public double ingresar(CuentaBancaria c1) {

        System.out.println("Ingrese el saldo que quiere ingresar:");
        double ingreso = leer.nextDouble();

        c1.setSaldoActual(c1.getSaldoActual() + ingreso);
        System.out.println("Su saldo actual es de: " + c1.getSaldoActual());
        return c1.getSaldoActual();
    }

    public double retirar(CuentaBancaria c1) {
        System.out.println("Ingrese el saldo que quiere retirar:");
        double retirar = leer.nextDouble();

        if (c1.getSaldoActual() > retirar) {
            c1.setSaldoActual(c1.getSaldoActual() - retirar);

        } else if (retirar >= c1.getSaldoActual()) {

            c1.setSaldoActual(0);

            System.out.println("No tenes la plata suficiente, te saque la que tenes.");
        }
        return c1.getSaldoActual();
    }

    public double extraccionR(CuentaBancaria c1) {

        double retirar;
        System.out.println("Ingrese el monto a retirar:" + (c1.getSaldoActual() * 0.2));
        retirar = leer.nextDouble();
        if (retirar  <=  (c1.getSaldoActual() * 0.20)) {
            c1.setSaldoActual(c1.getSaldoActual() - retirar);
        } else {

            System.out.println("No se puede loco");
        }
        return c1.getSaldoActual();
    }

    public void consulta(CuentaBancaria c1) {

        System.out.println("Saldo actual: " + c1.getSaldoActual());

    }

    public void ConsultaDatos(CuentaBancaria c1) {

        System.out.println(c1);
    }

}

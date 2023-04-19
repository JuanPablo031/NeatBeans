/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8.ejercicio.pkg1;

import CuentaBancaria.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Guia8Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancariaServicio s1 = new CuentaBancariaServicio();

        CuentaBancaria c1 = s1.CuentaBancariaServicio();
        int opcion;

        do {
            System.out.println("Que desea hacer?: \n 1) Ingresar dinero. \n 2) Retirar dinero. \n 3) Extraccion rapida. \n 4) Consultar saldo. \n 5) Consultar datos. \n 6) Salir.");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    s1.ingresar(c1);
                    break;
                case 2:
                    s1.retirar(c1);
                    break;
                case 3:
                    s1.extraccionR(c1);
                    break;
                case 4:
                    s1.consulta(c1);
                    break;
                case 5:
                    s1.ConsultaDatos(c1);
                    break;
                case 6:
                   opcion = 6;
                    break;

                default:
                    System.out.println("ERROR");
            }

        } while (opcion != 6);

    }

}

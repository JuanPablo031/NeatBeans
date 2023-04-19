/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Juego {

    public void IniciarJuego() {

        Scanner leer = new Scanner(System.in);
        System.out.println("|J1| Ingrese un numero");
        int num = leer.nextInt();

        int intento = 1;
        int J1 = 0, J2 = 0;
        do {
            System.out.println("|J2| Ingrese el numero para adivinar:");

            int num2 = leer.nextInt();

            if (num2 == num) {

                System.out.println("Adivinaste el numero: " + num);
                System.out.println("Utilizaste: " + intento + " intentos.");
                break;
            } else if (num2 > num) {
                intento++;
                System.out.println("Es mayor tu numero");

            } else {
                intento++;
                System.out.println("Es menor tu numero");

            }
        } while (intento < 6);

        if (intento == 6) {
            J1++;
            System.out.println("Te quedaste sin intentos.");
        } else if (intento < 5) {
            J2++;
        }
        System.out.println("|J1| Tiene: " + J1 + " Puntos");
        System.out.println("|J2| Tiene: " + J2 + " Puntos");
    }

}

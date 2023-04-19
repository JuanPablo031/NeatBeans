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
public class Empleado {

    public String nombre;
    public int edad;
    public double salario;

    public void calcularAumento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        System.out.println("Ingrese su edad:");
        edad = leer.nextInt();

        System.out.println("Ingrese su salario:");
        salario = leer.nextDouble();

        if (edad > 30) {
            salario = salario + (salario * 0.10);
        } else {
            salario = salario + (salario * 0.05);
            
        }
        
        System.out.println("Tu salario es de: $"+ salario);
    }

}

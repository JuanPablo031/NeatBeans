/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class CircunferenciaInterior {
    
    private double radio;

    public CircunferenciaInterior() {
    }

    public CircunferenciaInterior(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void nombre (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
}
    
    public double area() {
    double area = Math.PI * radio * radio;
    
        System.out.println("Area: " + area);
        return area;
}
    public double perimetro(){
        
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro: " + perimetro);
        return perimetro;
    }
}

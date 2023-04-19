/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class RectanguloEntidad {
    
    private int base;
    private int altura;
    private int Perimetro;
    private int superficie;

    public RectanguloEntidad() {
    }

    public RectanguloEntidad(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
 
    


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void tamaño(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la base:");
       this.base = leer.nextInt();
        System.out.println("Ingrese el tamaño de la altura:");
       this.altura = leer.nextInt();
    }

    public void Perimetro(){
       
 
        this.Perimetro = (base + altura) * 2;
        System.out.println("El perimetro es: " + Perimetro);
    }
    public void superficie(){
    
    this.superficie = base * altura;
        System.out.println("La superficie es: " + superficie);
}
    
    public void dibujo(){
        
        for (int i = 1; i <= altura; i++) {
            System.out.println("");
            for (int j = 1; j <= base ; j++) {
                
                if (i == 1 || i == altura || j == 1 || j == base) {
                    
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }     System.out.println("");
        
       
    }
    
    
    
}

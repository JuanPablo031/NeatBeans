/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.pkg6.ejercicios.extra.pkg1;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Clase36EjerciciosExtra1 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        int hour=0;
        int day=0;
        int minutos=0;
        int restominutos =0;
        int restohoras =0;
        
         System.out.println("ingrese un numero");
         minutos = leer.nextInt();
         
         hour = minutos/60;
         
         //restominutos = minutos % 60;
         minutos = minutos - (hour * 60);
         
         day = hour/24;
         //hour = hour - (day*24);
         hour = hour % 24;
         
         System.out.println("Dias: " + day);
         System.out.println("Horas: " + hour);        
         System.out.println("Minutos: " + minutos);
    }
    
}

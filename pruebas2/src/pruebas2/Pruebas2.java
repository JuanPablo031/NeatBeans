/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas2;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Pruebas2 {

    /**
     * @param args the command line arguments
     */
    /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 
10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.*/
public static void main (String [] args){
    
Scanner leer=new Scanner(System.in);
        double PrimerTtrabajoPrácticoEvaluativo;
        double SegundoTrabajoPrácticoEvaluativo;
        double PrimerIntegrador;
        double SegundoIntegrador;
        double cont = 0; cont1=0; cont2=0;
        double alumnos = 10;
        double promedio;
        
        while (cont <=10){
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese la  notas PrimerTrabajoPrácticoEvaluativo");
            PrimerTrabajoPrácticoEvaluativo= nextDouble();
            
            System.out.println("ingrese la  notas segundoTrabajoPrácticoEvaluativo");
            segundoTrabajoPrácticoEvaluativo= nextDouble();
         
            System.out.println("ingrese la  notas PrimerIntegrador");
            PrimerIntegrador= nextDouble();
            
            System.out.println("ingrese la  notas segundoIntegrador");
            segundoIntegrador= nextDouble();
       
        promedio =(primerTrabajoPrácticoEvaluativo * 0.1) +(segundoTrabajoPrácticoEvaluativo *0.15 )+ (PrimerIntegrador*0.25 )+(segundoIntegrador*0.5);
        vector[i]= promedio
                cont ++;
    }
         }
        for (int i = 0; i < 10; i++) {
            if(promedio>= 7){
                cont1 ++;
                
                System.out.println("");
            }else{
                cont2 ++;
            }
        }
        ///PARA IMPRIMIR
        for (int i=0;i<1;i++){
            System.out.println(vector[i]);
        }
   
        for (int i=0;i<1;i++){
            if (vector[i]>=7){
                cont1=cont1+1;    
            }else{
                cont2=cont2+1;
            }
        }
        System.out.println("La cantidad de aprobados fueron "+ cont1);
        System.out.println("La cantidad de desaprobados fueron " +cont2);
}



    
}
    




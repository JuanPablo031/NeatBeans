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
public class Cancion {

    public String titulo;
    public String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";

    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String cancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion:");
        String Titulo = leer.next();
       return Titulo;
        
    }

    public String Autor() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el autor de la cancion:");
        String Autor = leer.next();
        
       return Autor;
       

    }

   
    }



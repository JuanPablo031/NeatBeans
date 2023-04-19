/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author blanc
 */
public class InteriorLibro {
    public String Autor;
      public String Titulo;
        public int Paginas;
          public int ISBN;

    public InteriorLibro() {
    }

    public InteriorLibro(String Autor, String Titulo, int Paginas, int ISBN) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Paginas = Paginas;
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
          
          
}

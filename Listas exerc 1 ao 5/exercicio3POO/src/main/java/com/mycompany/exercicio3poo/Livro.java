package com.mycompany.exercicio3poo;

/**
 *
 * @author Damy
 */
public class Livro {
    String titulo;
    String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro " +
                "Titulo: " + titulo +
                ", Autor: " + autor ;
    }
}


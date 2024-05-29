package com.mycompany.exercicio3poo;

/**
 *
 * @author Damy
 */
import java.util.Stack;

public class Biblioteca {
    private Stack<Livro> pilhaDeLivros = new Stack<>();

    public void adicionarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        pilhaDeLivros.push(livro);
        System.out.println("Livro adicionado à pilha!\n" + livro);
    }

    public void listarLivros() {
        System.out.println("Livros na pilha:");
        for (Livro livro : pilhaDeLivros) {
            System.out.println(livro);
        }
    }

    public void retirarLivro() {
        if (!pilhaDeLivros.isEmpty()) {
            Livro livroRemovido = pilhaDeLivros.pop();
            System.out.println("Livro removido da pilha: " + livroRemovido);
        } else {
            System.out.println("Não há livros na pilha.");
        }
    }
}


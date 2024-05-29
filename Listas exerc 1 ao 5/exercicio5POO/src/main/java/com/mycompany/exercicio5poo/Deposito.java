package com.mycompany.exercicio5poo;

/**
 *
 * @author Damy
 */
import java.util.Stack;

public class Deposito {
    private static final int TAMANHO_MAXIMO_PILHA = 10;
    private Stack<Produto> pilhaDeProdutos = new Stack<>();

    public void adicionarProduto(Produto produto) {
        if (pilhaDeProdutos.size() < TAMANHO_MAXIMO_PILHA) {
            pilhaDeProdutos.push(produto);
            System.out.println("Produto adicionado à pilha: " + produto);
        } else {
            System.out.println("A pilha está cheia. "
                    + "Não é possível adicionar mais produtos.");
        }
        mostrarPilha();
    }

    public void despacharProduto() {
        if (!pilhaDeProdutos.isEmpty()) {
            Produto produtoDespachado = pilhaDeProdutos.pop();
            System.out.println("Produto despachado: " + produtoDespachado);
        } else {
            System.out.println("Não há produtos na pilha para despachar.");
        }
        mostrarPilha();
    }

    private void mostrarPilha() {
        System.out.println("Produtos na pilha:");
        for (int i = pilhaDeProdutos.size() - 1; i >= 0; i--) {
            System.out.println(pilhaDeProdutos.get(i));
        }
    }
}


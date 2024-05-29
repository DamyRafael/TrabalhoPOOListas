package com.mycompany.exercicio3poo;

/**
 *
 * @author Damy
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Retirar livro");
            System.out.println("4 - Sair\n");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Informe o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Informe o autor do livro: ");
                    String autor = scanner.nextLine();
                    biblioteca.adicionarLivro(titulo, autor);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    biblioteca.retirarLivro();
                    break;
                case 4:
                    System.out.println("Você escolheu sair! Até a próxima.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!!");
            }
        }
    }
}


package com.mycompany.exercicio5poo;

/**
 *
 * @author Damy
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepositoApp {
    private static final int NUMERO_DE_PILHAS = 5;
    private List<Deposito> depositos = new ArrayList<>();

    public DepositoApp() {
        for (int i = 0; i < NUMERO_DE_PILHAS; i++) {
            depositos.add(new Deposito());
        }
    }

    public void adicionarProduto(int numeroPilha, Produto produto) {
        if (numeroPilha >= 0 && numeroPilha < NUMERO_DE_PILHAS) {
            depositos.get(numeroPilha).adicionarProduto(produto);
        } else {
            System.out.println("Número de pilha inválido.");
        }
    }

    public void despacharProduto(int numeroPilha) {
        if (numeroPilha >= 0 && numeroPilha < NUMERO_DE_PILHAS) {
            depositos.get(numeroPilha).despacharProduto();
        } else {
            System.out.println("Número de pilha inválido.");
        }
    }

    public static void main(String[] args) {
        DepositoApp depositoApp = new DepositoApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Despachar produto");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Informe o número da pilha (0-" + 
                            (NUMERO_DE_PILHAS - 1) + "): ");
                    int numeroPilhaAdicao = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Informe o código do produto: ");
                    int codProduto = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Informe a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Informe a data de entrada do produto: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Informe o UF de origem do produto: ");
                    String ufOrigem = scanner.nextLine();
                    System.out.print("Informe o UF de destino do produto: ");
                    String ufDestino = scanner.nextLine();
                    Produto produto = new Produto(codProduto, descricao, 
                            dataEntrada, ufOrigem, ufDestino);
                    depositoApp.adicionarProduto(numeroPilhaAdicao, 
                            produto);
                    break;
                case 2:
                    System.out.print("Informe o número da pilha (0-" + 
                            (NUMERO_DE_PILHAS - 1) + "): ");
                    int numeroPilhaDespacho = scanner.nextInt();
                    scanner.nextLine(); 
                    depositoApp.despacharProduto(numeroPilhaDespacho);
                    break;
                case 3:
                    System.out.println("Você escolheu sair! Até mais.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}


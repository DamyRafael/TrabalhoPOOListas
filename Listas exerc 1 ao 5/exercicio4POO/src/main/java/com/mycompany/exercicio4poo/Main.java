package com.mycompany.exercicio4poo;

/**
 *
 * @author Damy
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
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
                    deposito.adicionarProduto(produto);
                    break;
                case 2:
                    deposito.despacharProduto();
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


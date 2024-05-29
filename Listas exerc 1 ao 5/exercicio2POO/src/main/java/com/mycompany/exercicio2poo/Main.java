/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2poo;

/**
 *
 * @author Damy
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Chamar próximo cliente\n");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o ano de nascimento do cliente: ");
                    int anoNascimento = scanner.nextInt();
                    banco.adicionarCliente(nome, anoNascimento);
                    break;
                case 2:
                    banco.chamarCliente();
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        }
    }
}

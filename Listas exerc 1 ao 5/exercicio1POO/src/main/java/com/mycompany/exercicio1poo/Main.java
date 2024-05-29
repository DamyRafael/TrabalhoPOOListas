package com.mycompany.exercicio1poo;

/**
 *
 * @author Damy
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaClinica fila = new FilaClinica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo paciente");
            System.out.println("3 - Sair\n");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nAdicione o nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    fila.adicionarPaciente(nomePaciente);
                    break;
                case 2:
                    fila.chamarProximoPaciente();
                    break;
                case 3:
                    System.out.println("Você escolheu sair! Até mais.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!!");
            }
        }
    }
}




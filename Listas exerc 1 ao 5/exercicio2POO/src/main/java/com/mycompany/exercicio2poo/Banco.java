package com.mycompany.exercicio2poo;

/**
 *
 * @author Damy
 */
import java.util.LinkedList;
import java.util.Queue;

public class Banco {
    private static final int CLIENTES_PRIORITARIOS_POR_NORMAL = 2;
    private Queue<Cliente> filaPrioritaria = new LinkedList<>();
    private Queue<Cliente> filaNormal = new LinkedList<>();
    private int clientesPrioritariosAtendidos = 0;

    public void adicionarCliente(String nome, int anoNascimento) {
        int senha = filaPrioritaria.size() + filaNormal.size() + 1;
        Cliente cliente = new Cliente(senha, nome, anoNascimento);

        if (anoNascimento <= 1959) { 
            filaPrioritaria.offer(cliente);
        } else {
            filaNormal.offer(cliente);
        }

        System.out.println(nome + " foi adicionado à fila. Senha: " + senha);
    }

    public void chamarCliente() {
        if (!filaPrioritaria.isEmpty()) {
            atenderCliente(filaPrioritaria.poll());
        } else if (!filaNormal.isEmpty()) {
            atenderCliente(filaNormal.poll());
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    private void atenderCliente(Cliente cliente) {
        System.out.println("Cliente atendido: " + cliente.nome + 
                ", Senha: " + cliente.senha);
        if (++clientesPrioritariosAtendidos % CLIENTES_PRIORITARIOS_POR_NORMAL == 0) {
            System.out.println("Atendendo um cliente.");
            if (!filaNormal.isEmpty()) {
                Cliente clienteNormal = filaNormal.poll();
                System.out.println("Cliente atendido: " + clienteNormal.nome);
            }
        }
    }
}


package com.mycompany.exercicio1poo;

/**
 *
 * @author Damy
 */
import java.util.LinkedList;
import java.util.Queue;

public class FilaClinica {
    private static final int senhasDiarias = 20;
    private Queue<String> filaEspera = new LinkedList<>();

    public void adicionarPaciente(String nome) {
        if (filaEspera.size() < senhasDiarias) {
            filaEspera.offer(nome);
            System.out.println(nome + 
                    " foi adicionado à fila. Senhas disponíveis: " + 
                    (senhasDiarias - filaEspera.size()));
        } else {
            System.out.println("Não há mais senhas disponíveis para hoje.");
        }
    }

    public void chamarProximoPaciente() {
        if (!filaEspera.isEmpty()) {
            String proximoPaciente = filaEspera.poll();
            System.out.println("Próximo paciente: " + proximoPaciente);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }
}



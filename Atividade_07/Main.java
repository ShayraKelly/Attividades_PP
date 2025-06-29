package Atividade_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FabricaVioloes fabrica = new FabricaVioloes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um tipo de Violão:");
        System.out.println("classico, folk, flet, jumbo, 7cordas, 12cordas, zero, duploZero, triploZero");
        String escolha = scanner.nextLine();

        try {
            ViolaoPrototype violao = fabrica.criarViolao(escolha);
            System.out.println("\nViolão criado:");
            violao.exibirInformacoes();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
package Atividade_15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validador cadeia = new VerificaLogin();
        cadeia.definirProximo(new VerificaMaiuscula())
              .definirProximo(new VerificaMinuscula())
              .definirProximo(new VerificaEspecial())
              .definirProximo(new VerificaNumero())
              .definirProximo(new VerificaSequencia())
              .definirProximo(new VerificaTamanhoMinimo())
              .definirProximo(new VerificaTamanhoMaximo())
              .definirProximo(new FimVerificacao());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu login: ");
        String login = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        cadeia.verificar(login, senha);

        scanner.close();
    }
}
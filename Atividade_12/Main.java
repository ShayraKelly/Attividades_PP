package Atividade_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new AssinaturaBase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sua assinatura base foi criada: R$ 9,99");
        System.out.println("Deseja adicionar pacotes? Digite os números separados por espaço ou 0 para não adicionar.");

        System.out.println("1 - Vários dispositivos (+19,99)");
        System.out.println("2 - Frete Grátis (+9,99)");
        System.out.println("3 - Caixa Surpresa (+29,99)");
        System.out.println("4 - Cartão de Crédito Platinum (+49,99)");
        System.out.println("5 - Compra com Cash Back (+19,99)");

        String[] escolhas = scanner.nextLine().split(" ");
        boolean[] pacotesAdicionados = new boolean[5]; // Para evitar repetição

        for (String escolha : escolhas) {
            switch (escolha) {
                case "1":
                    if (!pacotesAdicionados[0]) {
                        assinatura = new PacoteVariosDispositivos(assinatura);
                        pacotesAdicionados[0] = true;
                    }
                    break;
                case "2":
                    if (!pacotesAdicionados[1]) {
                        assinatura = new PacoteFreteGratis(assinatura);
                        pacotesAdicionados[1] = true;
                    }
                    break;
                case "3":
                    if (!pacotesAdicionados[2]) {
                        assinatura = new PacoteCaixaSurpresa(assinatura);
                        pacotesAdicionados[2] = true;
                    }
                    break;
                case "4":
                    if (!pacotesAdicionados[3]) {
                        assinatura = new PacoteCartaoPlatinum(assinatura);
                        pacotesAdicionados[3] = true;
                    }
                    break;
                case "5":
                    if (!pacotesAdicionados[4]) {
                        assinatura = new PacoteCashBack(assinatura);
                        pacotesAdicionados[4] = true;
                    }
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opção inválida: " + escolha);
            }
        }

        System.out.println("\n--- RESUMO DA ASSINATURA ---");
        System.out.println("Descrição: " + assinatura.descricao());
        System.out.printf("Preço final: R$ %.2f\n", assinatura.preco());

        scanner.close();
    }
}
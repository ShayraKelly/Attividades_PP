package Atividade_09;

import java.util.Scanner;

public class LojaQuadrinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Loja de Quadrinhos!");
        System.out.println("Digite o nível da sua assinatura (Bronze, Prata, Ouro, Platina):");
        String nivel = scanner.nextLine();

        CaixaAssinatura caixa = new CaixaAssinatura(nivel);
        caixa.mostrarConteudo();

        scanner.close();
    }
}

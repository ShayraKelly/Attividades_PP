package Loja_Esportiva.View;
import Loja_Esportiva.Model.Camisas.Camisa;
import java.util.Scanner;

public class LojaView {
    private Scanner scanner;

    public LojaView() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenuEObterEscolha() {
        System.out.println("\n-----Seja bem-vindo à Loja de camisas esportivas da Shayra! -----\n");
        System.out.println("Escolha o time de sua preferência para ver a camisa:");
        System.out.println("1 - Brasil");
        System.out.println("2 - Flamengo");
        System.out.println("3 - Botafogo");
        System.out.println("4 - Fluminense");
        System.out.println("5 - Vasco");
        System.out.println("0 - Sair");
        System.out.print("Digite o número do time: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Por favor, digite um dos números informados.");
            scanner.next();
            System.out.print("Digite o número do time: ");
        }

        int escolha = scanner.nextInt();
        scanner.nextLine(); 
        return escolha;
    }

    public void exibirDetalhes(Camisa camisa) {
        if (camisa != null) {
            System.out.println("==============================");
            System.out.println("\n    DETALHES DO PRODUTO\n");
            camisa.exibirDetalhes();
            System.out.println("\n==============================");
        } else {
            System.err.println("Opção selecionada é inválida ou não foi possível encontrar a camisa.");
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void fecharScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
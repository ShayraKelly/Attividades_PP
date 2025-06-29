package Atividade_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CaixaAssinatura {
    private List<Item> itens = new ArrayList<>();
    private int limiteItens;

    private static Item[] itensDisponiveis = {
        new Item("Quadrinho", 15.00),
        new Item("Chaveiro", 5.00),
        new Item("Busto", 10.00),
        new Item("Adesivo", 1.00),
        new Item("Poster", 25.00),
        new Item("Camiseta", 25.00),
        new Item("Caneta", 3.00),
        new Item("Miniatura", 20.00)
    };

    public CaixaAssinatura(String nivelCliente) {
        switch (nivelCliente.toLowerCase()) {
            case "bronze":
                limiteItens = 3;
                break;
            case "prata":
                limiteItens = 5;
                break;
            case "ouro":
                limiteItens = 7;
                break;
            case "platina":
                limiteItens = 10;
                break;
            default:
                throw new IllegalArgumentException("Nível inválido!");
        }
        preencherCaixa();
    }

    private void preencherCaixa() {
        Random random = new Random();
        for (int i = 0; i < limiteItens; i++) {
            int indice = random.nextInt(itensDisponiveis.length);
            itens.add(itensDisponiveis[indice]);
        }
    }

    public void mostrarConteudo() {
        System.out.println("Itens da caixa:");
        for (Item item : itens) {
            System.out.println("- " + item);
        }
        System.out.println("Valor total: R$ " + String.format("%.2f", calcularValorTotal()));
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}

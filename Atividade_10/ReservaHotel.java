package Atividade_10;

public class ReservaHotel {
    private String tipoQuarto;
    private int pessoas;
    private double precoDiaria;

    public ReservaHotel(String tipoQuarto, int pessoas) {
        this.tipoQuarto = tipoQuarto;
        this.pessoas = pessoas;
        definirPreco();
    }

    private void definirPreco() {
        double simples = 200.0;
        if (tipoQuarto.equalsIgnoreCase("Simples")) {
            precoDiaria = simples;
        } else if (tipoQuarto.equalsIgnoreCase("Executivo")) {
            precoDiaria = simples * 1.5;
        } else if (tipoQuarto.equalsIgnoreCase("Suite")) {
            precoDiaria = simples * 1.5 * 3;
        }
    }

    public double getPrecoTotal() {
        return precoDiaria * pessoas;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }
}
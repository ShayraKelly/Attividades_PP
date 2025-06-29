package Atividade_10;

public class AluguelCarro {
    private String tipoCarro;
    private double precoDiaria;

    public AluguelCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
        definirPreco();
    }

    private void definirPreco() {
        double economico = 150.0;
        if (tipoCarro.equalsIgnoreCase("Econômico")) {
            precoDiaria = economico;
        } else if (tipoCarro.equalsIgnoreCase("Executivo")) {
            precoDiaria = economico * 2;
        } else if (tipoCarro.equalsIgnoreCase("Luxo")) {
            precoDiaria = economico * 2 * 2;
        }
    }

    public double getPreco() {
        return precoDiaria;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }
}
package Atividade_10;

public class Pagamento {
    private String forma;
    private double valorOriginal;

    public Pagamento(String forma, double valorOriginal) {
        this.forma = forma;
        this.valorOriginal = valorOriginal;
    }

    public double calcularValorFinal(int parcelas) {
        double valor = valorOriginal;
        if (forma.equalsIgnoreCase("PIX")) {
            valor *= 0.9;
        } else if (forma.equalsIgnoreCase("Boleto")) {
            valor *= 0.95;
        } else if (forma.equalsIgnoreCase("Crédito")) {
            if (parcelas > 1) {
                valor *= (1 + ((parcelas - 1) * 0.0399));
            }
        }
        return valor;
    }

    public String getForma() {
        return forma;
    }
}
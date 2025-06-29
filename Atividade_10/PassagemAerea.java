package Atividade_10;

public class PassagemAerea {
    private String assento;
    private String classeVoo;
    private double preco;

    public PassagemAerea(String assento) {
        this.assento = assento;
        definirClasseEPreco();
    }

    private void definirClasseEPreco() {
        int fileira = Integer.parseInt(assento.substring(0, assento.length() - 1));
        double precoEconomica = 500.0;

        if (fileira >= 1 && fileira <= 3) {
            classeVoo = "1ª Classe";
            preco = precoEconomica * 2.5 * 1.5; // Econômica + 150% da Executiva
        } else if (fileira >= 4 && fileira <= 8) {
            classeVoo = "Executiva";
            preco = precoEconomica * 2.5;
        } else {
            classeVoo = "Econômica";
            preco = precoEconomica;
        }
    }

    public double getPreco() {
        return preco;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public String getAssento() {
        return assento;
    }
}
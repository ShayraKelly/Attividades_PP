package Atividade_12;

public class AssinaturaBase implements Assinatura {
    @Override
    public String descricao() {
        return "Assinatura Base: Assistir vídeos em um único dispositivo";
    }

    @Override
    public double preco() {
        return 9.99;
    }
}
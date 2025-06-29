package Atividade_12;

public class PacoteCartaoPlatinum extends AssinaturaDecorator {
    public PacoteCartaoPlatinum(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Pacote: Cartão de Crédito Platinum";
    }

    @Override
    public double preco() {
        return super.preco() + 49.99;
    }
}
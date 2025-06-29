package Atividade_12;

public class PacoteCashBack extends AssinaturaDecorator {
    public PacoteCashBack(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Pacote: Compra com Cash Back";
    }

    @Override
    public double preco() {
        return super.preco() + 19.99;
    }
}
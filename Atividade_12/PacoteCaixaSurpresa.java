package Atividade_12;

public class PacoteCaixaSurpresa extends AssinaturaDecorator {
    public PacoteCaixaSurpresa(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Pacote: Caixa Surpresa com produtos";
    }

    @Override
    public double preco() {
        return super.preco() + 29.99;
    }
}
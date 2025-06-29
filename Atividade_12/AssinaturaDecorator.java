package Atividade_12;

public abstract class AssinaturaDecorator implements Assinatura {
    protected Assinatura assinatura;

    public AssinaturaDecorator(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String descricao() {
        return assinatura.descricao();
    }

    @Override
    public double preco() {
        return assinatura.preco();
    }
}
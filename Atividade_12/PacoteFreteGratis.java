package Atividade_12;

public class PacoteFreteGratis extends AssinaturaDecorator {
    public PacoteFreteGratis(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Pacote: Frete Grátis em produtos";
    }

    @Override
    public double preco() {
        return super.preco() + 9.99;
    }
}
package Atividade_12;

public class PacoteVariosDispositivos extends AssinaturaDecorator {
    public PacoteVariosDispositivos(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String descricao() {
        return super.descricao() + ", Pacote: Vários dispositivos";
    }

    @Override
    public double preco() {
        return super.preco() + 19.99;
    }
}
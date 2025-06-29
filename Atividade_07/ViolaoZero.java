package Atividade_07;

public class ViolaoZero extends Violao {
    public ViolaoZero() {
        super("Violão Zero",
              "Tamanho menor, confortável para tocar por bastante tempo.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoZero();
    }
}
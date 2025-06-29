package Atividade_07;

public class ViolaoTriploZero extends Violao {
    public ViolaoTriploZero() {
        super("Violão Triplo Zero",
              "Tamanho intermediário, timbre peculiar, indicado para uso casual.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoTriploZero();
    }
}
package Atividade_07;

public class ViolaoDuploZero extends Violao {
    public ViolaoDuploZero() {
        super("Violão Duplo Zero",
              "Um pouco maior, boa sonoridade, ideal para fingerstyle.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoDuploZero();
    }
}
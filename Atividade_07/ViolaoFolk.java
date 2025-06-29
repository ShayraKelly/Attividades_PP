package Atividade_07;

public class ViolaoFolk extends Violao {
    public ViolaoFolk() {
        super("Violão Folk",
              "Corpo maior, cordas de aço, som encorpado, ideal para pop e rock.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFolk();
    }
}
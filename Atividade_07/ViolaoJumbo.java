package Atividade_07;

public class ViolaoJumbo extends Violao {
    public ViolaoJumbo() {
        super("Violão Jumbo",
              "Corpo largo, base arredondada, som grave e encorpado.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoJumbo();
    }
}
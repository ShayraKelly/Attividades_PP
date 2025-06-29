package Atividade_07;

public class ViolaoFlet extends Violao {
    public ViolaoFlet() {
        super("Violão Flet",
              "Caixa acústica fina, cordas de nylon, timbre suave, precisa de amplificação.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoFlet();
    }
}
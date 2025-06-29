package Atividade_07;

public class ViolaoClassico extends Violao {
    public ViolaoClassico() {
        super("Violão Clássico",
              "Modelo acústico com seis cordas de nylon, baixo custo e indicado para iniciantes.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoClassico();
    }
}
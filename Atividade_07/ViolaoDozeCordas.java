package Atividade_07;

public class ViolaoDozeCordas extends Violao {
    public ViolaoDozeCordas() {
        super("Violão 12 Cordas",
              "Doze cordas agrupadas em duplas, ressonância plena, exige técnica.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoDozeCordas();
    }
}
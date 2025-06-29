package Atividade_07;

public class ViolaoSeteCordas extends Violao {
    public ViolaoSeteCordas() {
        super("Violão 7 Cordas",
              "Semelhante ao clássico, mas com sétima corda mais grave. Popular no samba e choro.");
    }

    @Override
    public ViolaoPrototype clonar() {
        return new ViolaoSeteCordas();
    }
}
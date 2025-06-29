package Atividade_15;

public abstract class Validador {
    public Validador proximo;

    public Validador definirProximo(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean verificar(String login, String senha);
}
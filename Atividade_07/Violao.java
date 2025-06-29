package Atividade_07;

public abstract class Violao implements ViolaoPrototype{
    private String tipo;
    private String descricao;

    public Violao(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
    }
}
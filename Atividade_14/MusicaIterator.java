package Atividade_14;

public class MusicaIterator implements IteratorMidia {
    private ListaMusicas listaMusicas;
    private int posicao = 0;

    public MusicaIterator(ListaMusicas listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    @Override
    public boolean hasNext() {
        return posicao < listaMusicas.getMusicas().size();
    }

    @Override
    public String next() {
        return listaMusicas.getMusicas().get(posicao++);
    }
}
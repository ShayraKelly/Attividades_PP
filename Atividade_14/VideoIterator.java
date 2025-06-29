package Atividade_14;

public class VideoIterator implements IteratorMidia {
    private ListaVideos listaVideos;
    private int posicao = 0;

    public VideoIterator(ListaVideos listaVideos) {
        this.listaVideos = listaVideos;
    }

    @Override
    public boolean hasNext() {
        return posicao < listaVideos.getVideos().size();
    }

    @Override
    public String next() {
        return listaVideos.getVideos().get(posicao++);
    }
}
package Atividade_14;

import java.util.ArrayList;
import java.util.List;

public class ListaMusicas implements ColecaoMidia {
    private List<String> musicas = new ArrayList<>();

    public void adicionarMusica(String musica) {
        musicas.add(musica);
    }

    public List<String> getMusicas() {
        return musicas;
    }

    @Override
    public IteratorMidia criarIterator() {
        return new MusicaIterator(this);
    }
}
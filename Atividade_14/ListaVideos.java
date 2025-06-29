package Atividade_14;

import java.util.ArrayList;
import java.util.List;

public class ListaVideos implements ColecaoMidia {
    private List<String> videos = new ArrayList<>();

    public void adicionarVideo(String video) {
        videos.add(video);
    }

    public List<String> getVideos() {
        return videos;
    }

    @Override
    public IteratorMidia criarIterator() {
        return new VideoIterator(this);
    }
}
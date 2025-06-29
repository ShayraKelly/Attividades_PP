package Atividade_14;

public class Main {
    public static void main(String[] args) {
        ListaMusicas listaMusicas = new ListaMusicas();
        listaMusicas.adicionarMusica("Música 1 - Imagine Dragons");
        listaMusicas.adicionarMusica("Música 2 - Queen");
        listaMusicas.adicionarMusica("Música 3 - Coldplay");

        ListaVideos listaVideos = new ListaVideos();
        listaVideos.adicionarVideo("Vídeo 1 - Trailer de Filme");
        listaVideos.adicionarVideo("Vídeo 2 - Aula de Java");
        listaVideos.adicionarVideo("Vídeo 3 - Stand-up Comedy");

        Player player = new Player();

        System.out.println("🎵 === Playlist de Músicas ===");
        player.reproduzirColecao(listaMusicas);

        System.out.println("\n🎥 === Playlist de Vídeos ===");
        player.reproduzirColecao(listaVideos);
    }
}
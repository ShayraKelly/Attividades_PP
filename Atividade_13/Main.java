package Atividade_13;

public class Main {
    public static void main(String[] args) {
        PlataformaStreaming plataforma = new PlataformaStreaming();

        Usuario u1 = new Usuario("Shayra");
        Usuario u2 = new Usuario("Hugo");

        
        u1.seguirGenero("Ação");
        u1.seguirGenero("Anime");
        u1.seguirGenero("Comédia");
        u1.seguirGenero("Comédia Romântica");
        u1.seguirGenero("Romance");

        u2.seguirGenero("Ação");
        u2.seguirGenero("Anime");
        u2.seguirGenero("Comédia");
        u2.seguirGenero("Ficção Científica");

        registrarUsuario(plataforma, u1);
        registrarUsuario(plataforma, u2);

        plataforma.adicionarConteudo("Ação", "Missão Impossível");
        plataforma.adicionarConteudo("Anime", "Demon Slayer - Nova Temporada");
        plataforma.adicionarConteudo("Comédia", "Todo Mundo em Pânico 4");
        plataforma.adicionarConteudo("Comédia Romântica", "Como perder um homem em 10 dias");
        plataforma.adicionarConteudo("Ficção Científica", "Matrix");
        plataforma.adicionarConteudo("Romance", "Orgulho e Preconceito");
    }

    private static void registrarUsuario(PlataformaStreaming plataforma, Usuario usuario) {
        String[] generos = {"Ação", "Anime", "Comédia", "Comédia Romântica", "Ficção Científica", "Romance"};
        for (String genero : generos) {
            if (usuario.segue(genero)) {
                plataforma.registrar(usuario, genero);
            }
        }
    }
}
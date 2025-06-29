package Atividade_13;

import java.util.HashSet;
import java.util.Set;

public class Usuario implements Observer {
    private String nome;
    private Set<String> generosSeguindo = new HashSet<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void seguirGenero(String genero) {
        generosSeguindo.add(genero);
    }

    public void cancelarGenero(String genero) {
        generosSeguindo.remove(genero);
    }

    public boolean segue(String genero) {
        return generosSeguindo.contains(genero);
    }

    @Override
    public void update(String genero, String titulo) {
        System.out.println("[" + nome + "] Notificado: Novo conteúdo adicionado - '" + titulo + "' [" + genero + "]");
    }
}
package Atividade_13;

import java.util.*;

public class PlataformaStreaming implements Subject {
    private Map<String, List<Observer>> observadoresPorGenero = new HashMap<>();

    public PlataformaStreaming() {
        observadoresPorGenero.put("Ação", new ArrayList<>());
        observadoresPorGenero.put("Comédia", new ArrayList<>());
        observadoresPorGenero.put("Terror", new ArrayList<>());
        observadoresPorGenero.put("Anime", new ArrayList<>());
        observadoresPorGenero.put("Ficção Científica", new ArrayList<>());
    }

    @Override
    public void registrar(Observer o, String genero) {
        List<Observer> obs = observadoresPorGenero.get(genero);
        if (obs != null && !obs.contains(o)) {
            obs.add(o);
        }
    }

    @Override
    public void remover(Observer o, String genero) {
        List<Observer> obs = observadoresPorGenero.get(genero);
        if (obs != null) {
            obs.remove(o);
        }
    }

    @Override
    public void notificar(String genero, String titulo) {
        List<Observer> obs = observadoresPorGenero.get(genero);
        if (obs != null) {
            for (Observer o : obs) {
                o.update(genero, titulo);
            }
        }
    }

    public void adicionarConteudo(String genero, String titulo) {
        System.out.println("\n[Plataforma] Novo conteúdo: '" + titulo + "' [" + genero + "]");
        notificar(genero, titulo);
    }
}
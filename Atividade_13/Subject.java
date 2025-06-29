package Atividade_13;

public interface Subject {
    void registrar(Observer o, String genero);
    void remover(Observer o, String genero);
    void notificar(String genero, String titulo);
}
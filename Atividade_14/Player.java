package Atividade_14;

public class Player {
    public void reproduzirColecao(ColecaoMidia colecao) {
        IteratorMidia iterator = colecao.criarIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Reproduzindo: " + item);
        }
    }
}
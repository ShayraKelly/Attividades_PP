//Princípio da Substituição de Liskov (LSP)

package Atividade_02.Atividade.L.Incorreto;

class Pinguim extends Ave{
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }
}
//Princípio da Substituição de Liskov (LSP)

package Atividade_02.Atividade.L.Correto;

class AveVoadora extends Ave{
    public void voar() {
        System.out.println("Voando...");
    }

    public void comer() {
        System.out.println("Comendo...");
    }
}
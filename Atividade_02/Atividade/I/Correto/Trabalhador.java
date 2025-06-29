//Princípio da Segregação de Interface (ISP)

package Atividade_02.Atividade.I.Correto;

class Trabalhador implements Trabalhavel, Alimentavel{
    public void trabalhar() {
        System.out.println("Humano trabalhando...");
    }

    public void comer() {
        System.out.println("Humano comendo...");
    }
}
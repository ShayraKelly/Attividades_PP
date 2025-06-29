//Princípio da Segregação de Interface (ISP)

package Atividade_02.Atividade.I.Incorreto;

class Robo implements Trabalhador{
    public void trabalhar() {
        System.out.println("Robô trabalhando...");
    }

    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem!");
    }
}
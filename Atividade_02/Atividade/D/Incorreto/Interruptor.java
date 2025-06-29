//Princípio da Inversão de Dependência (DIP)

package Atividade_02.Atividade.D.Incorreto;

class Interruptor{
    private Lampada lampada;

    public Interruptor() {
        lampada = new Lampada();
    }

    public void operar() {
        lampada.ligar();
    }
}
//Princípio da Inversão de Dependência (DIP)

package Atividade_02.Atividade.D.Incorreto;

class Lampada {
    public void ligar() {
        System.out.println("Lâmpada ligada!");
    }

    public void desligar() {
        System.out.println("Lâmpada desligada!");
    }
}
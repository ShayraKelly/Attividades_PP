//Princípio da Inversão de Dependência (DIP)

package Atividade_02.Atividade.D.Correto;

class Lampada implements Dispositivo {
    public void ligar() {
        System.out.println("Lâmpada ligada!");
    }

    public void desligar() {
        System.out.println("Lâmpada desligada!");
    }
}
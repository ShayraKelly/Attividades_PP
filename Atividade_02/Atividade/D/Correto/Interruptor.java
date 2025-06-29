//Princípio da Inversão de Dependência (DIP)

package Atividade_02.Atividade.D.Correto;

class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operar() {
        dispositivo.ligar();
    }
}
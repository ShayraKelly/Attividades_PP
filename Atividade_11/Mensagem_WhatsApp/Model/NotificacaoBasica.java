package Atividade_11.Mensagem_WhatsApp.Model;

public class NotificacaoBasica implements Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando mensagem básica...");
    }
}
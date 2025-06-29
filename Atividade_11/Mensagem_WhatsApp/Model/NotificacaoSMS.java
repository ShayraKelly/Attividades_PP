package Atividade_11.Mensagem_WhatsApp.Model;

public class NotificacaoSMS extends NotificacaoDecorator {
    public NotificacaoSMS(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando também por SMS.");
    }
}
package Atividade_11.Mensagem_WhatsApp.Model;

public class NotificacaoWhatsapp extends NotificacaoDecorator {
    public NotificacaoWhatsapp(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando também por WhatsApp.");
    }
}
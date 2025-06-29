package Atividade_11.Mensagem_WhatsApp.Model;

public class NotificacaoPush extends NotificacaoDecorator {
    public NotificacaoPush(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando também Notificação Push.");
    }
}
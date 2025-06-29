package Atividade_11.Mensagem_WhatsApp.Model;

public class NotificacaoEmail extends NotificacaoDecorator {
    public NotificacaoEmail(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        super.enviar();
        System.out.println("Enviando também por Email.");
    }
}
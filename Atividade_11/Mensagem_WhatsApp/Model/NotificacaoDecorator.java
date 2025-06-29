package Atividade_11.Mensagem_WhatsApp.Model;

public abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacao;

    public NotificacaoDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar() {
        notificacao.enviar();
    }
}
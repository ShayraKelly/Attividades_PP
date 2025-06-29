package Atividade_11.Mensagem_WhatsApp.Controller;

import Atividade_11.Mensagem_WhatsApp.Model.*;
import Atividade_11.Mensagem_WhatsApp.View.NotificacaoView;

public class NotificacaoController {
    private Notificacao notificacao;
    private NotificacaoView view;

    public NotificacaoController(Notificacao notificacao, NotificacaoView view) {
        this.notificacao = notificacao;
        this.view = view;
    }

    public void enviarNotificacao() {
        view.mostrarMensagem("=== Iniciando envio ===");
        notificacao.enviar();
        view.mostrarMensagem("=== Fim do envio ===");
    }
}
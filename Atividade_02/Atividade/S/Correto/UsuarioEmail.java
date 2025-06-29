//Princípio da Responsabilidade Única (SRP)

package Atividade_02.Atividade.S.Correto;

public class UsuarioEmail{
    public void enviarEmailBoasVindas(Usuario usuario) {
        System.out.println("Enviando e-mail de boas-vindas para " + usuario.getEmail());
    }
}
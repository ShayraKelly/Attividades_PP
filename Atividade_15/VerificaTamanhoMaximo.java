package Atividade_15;

public class VerificaTamanhoMaximo extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (senha.length() > 20) {
            System.out.println("A senha NÃO pode ter mais de 20 caracteres.");
            return false;
        }
        System.out.println("A senha está dentro do limite máximo de caracteres.");
        return proximo.verificar(login, senha);
    }
}
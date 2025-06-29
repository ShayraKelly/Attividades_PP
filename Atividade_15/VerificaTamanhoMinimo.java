package Atividade_15;

public class VerificaTamanhoMinimo extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
            return false;
        }
        System.out.println("A senha possui o tamanho mínimo exigido.");
        return proximo.verificar(login, senha);
    }
}
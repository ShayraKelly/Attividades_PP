package Atividade_15;

public class FimVerificacao extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        System.out.println("Login e senha válidos! Acesso liberado!");
        return true;
    }
}
package Atividade_15;

public class VerificaEspecial extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (!senha.matches(".*[@#$%&*].*")) {
            System.out.println("A senha deve conter pelo menos 1 caractere especial (@, #, $, %, &, *).");
            return false;
        }
        System.out.println("A senha contém caractere especial.");
        return proximo.verificar(login, senha);
    }
}
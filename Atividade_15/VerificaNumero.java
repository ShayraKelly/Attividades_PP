package Atividade_15;

public class VerificaNumero extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (!senha.matches(".*[0-9].*")) {
            System.out.println("A senha deve conter pelo menos 1 número.");
            return false;
        }
        System.out.println("A senha contém número.");
        return proximo.verificar(login, senha);
    }
}
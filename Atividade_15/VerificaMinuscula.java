package Atividade_15;

public class VerificaMinuscula extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (!senha.matches(".*[a-z].*")) {
            System.out.println("A senha deve ter pelo menos 1 letra minúscula.");
            return false;
        }
        System.out.println("A senha contém letra minúscula.");
        return proximo.verificar(login, senha);
    }
}
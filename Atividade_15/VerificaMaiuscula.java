package Atividade_15;

public class VerificaMaiuscula extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("A enha deve ter pelo menos 1 letra MAIÚSCULA.");
            return false;
        }
        System.out.println("Senha contém letra MAIÚSCULA.");
        return proximo.verificar(login, senha);
    }
}
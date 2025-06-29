package Atividade_15;

public class VerificaSequencia extends Validador {
    @Override
    public boolean verificar(String login, String senha) {
        if (senha.matches(".*\\d{3,}.*")) {
            System.out.println("❌ Senha NÃO pode conter 3 números consecutivos.");
            return false;
        }
        System.out.println("✅ Senha NÃO possui 3 números consecutivos.");
        return proximo.verificar(login, senha);
    }
}
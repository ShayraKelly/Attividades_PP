package Atividade_15;

import java.util.Arrays;
import java.util.List;

public class VerificaLogin extends Validador {
    private List<String> loginsCadastrados = Arrays.asList("usuario1", "admin", "Shayra");

    @Override
    public boolean verificar(String login, String senha) {
        if (!loginsCadastrados.contains(login)) {
            System.out.println("Login não cadastrado no sistema.");
            return false;
        }
        System.out.println("Login cadastrado encontrado.");
        return proximo.verificar(login, senha);
    }
}
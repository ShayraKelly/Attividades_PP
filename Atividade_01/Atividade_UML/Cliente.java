package Atividade_UML;

public class Cliente extends Pessoa implements Autenticavel{
    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    public void Login(){
        System.out.println("Login realizado!");
    }
}
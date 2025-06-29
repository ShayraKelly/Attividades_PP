package Atividade_UML;

public class Diretor extends Funcionario implements Autenticavel{
    public Diretor(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email, cargo);
    }

    public double calcSalario(){
        System.out.println("Cálculo do salário do Diretor");
        return 0;
    }

    public void Login(){
        System.out.println("Login como diretor realizado!");
    }

}
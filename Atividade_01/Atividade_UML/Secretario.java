package Atividade_UML;

public class Secretario extends Funcionario{
    public Secretario(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email, cargo);
    }

    public double calcSalario(){
        System.out.println("Cálculo do salário do Secretário");
        return 0;
    }
}
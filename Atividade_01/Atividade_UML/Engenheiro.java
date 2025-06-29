package Atividade_UML;

public class Engenheiro extends Funcionario{
    public Engenheiro(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email, cargo);
    }

    public double calcSalario(){
        System.out.println("Cálculo do salário do Engenheiro");
        return 0;
    }

    public double comissao(){
        System.out.println("Comissão do Engenheiro");
        return 0;
    }
}
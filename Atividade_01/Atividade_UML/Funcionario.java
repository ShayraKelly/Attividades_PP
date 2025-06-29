package Atividade_UML;

public abstract class Funcionario extends Pessoa{
    private String cargo;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Funcionario(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email);
        this.cargo = cargo;
    }

    public abstract double calcSalario();

}
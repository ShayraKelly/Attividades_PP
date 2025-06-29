package Atividade_UML;

public class Gerente extends Funcionario implements Autenticavel, FornecedorManager, DepartamentoManager {
    public Gerente(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email, cargo);
    }

    public double calcSalario(){
        System.out.println("Cálculo do salário do Gerente");
        return 0;
    }

    public void Login(){
        System.out.println("Login como gerente realizado!");
    }

    public void cadastrarFornecedor() {
        System.out.println("Fornecedor contratado!");
    }

    public void criarDepartamento() {
        System.out.println("Departamento criado com sucesso!");
    }

    public void editarDepartamento() {
        System.out.println("Departamento editado com sucesso!");
    }
}
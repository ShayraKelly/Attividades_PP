//Princípio da Responsabilidade Única (SRP)

package Atividade_02.Atividade.S.Correto;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = "Shayra";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = "shayra.kelly@estudante.ifgoiano.edu.br";
    }
}
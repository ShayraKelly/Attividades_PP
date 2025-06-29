//Princípio da Responsabilidade Única (SRP)

package Atividade_02.Atividade.S.Incorreto;

class Usuario{
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
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // --- VIOLAÇÃO DO SRP ---
    // Esta responsabilidade de persistência não pertence a uma classe de modelo de dados.
    // Se a forma de salvar no banco mudar (ex: de SQL para NoSQL), esta classe terá que ser modificada.
    public void salvarNoBancoDados() {
        System.out.println("Salvando usuário " + nome + " no banco de dados.");
    }

    // --- VIOLAÇÃO DO SRP ---
    // Esta responsabilidade de comunicação também não pertence a uma classe de modelo de dados.
    // Se o serviço de e-mail mudar, esta classe terá que ser modificada.
    public void enviarEmailBoasVindas() {
        System.out.println("Enviando e-mail de boas-vindas para " + email);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Shayra", "shayra.kelly@estudante.ifgoiano.edu.br");
        usuario.salvarNoBancoDados();
        usuario.enviarEmailBoasVindas();
    }
}
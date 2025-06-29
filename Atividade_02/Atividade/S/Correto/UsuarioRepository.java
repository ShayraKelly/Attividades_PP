//Princípio da Responsabilidade Única (SRP)

package Atividade_02.Atividade.S.Correto;

public class UsuarioRepository {
    public void salvar(Usuario usuario) {
        System.out.println("Salvando usuário " + usuario.getNome() + " no banco de dados.");
    }
}
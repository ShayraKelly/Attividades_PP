package Atividade_10;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Maria Silva", "123.456.789-00"));
        listaClientes.add(new Cliente("João Souza", "987.654.321-00"));

        PacoteViagemFacade pacote = new PacoteViagemFacade(
            listaClientes,
            "2A",
            "Executivo",
            "Luxo",
            "Crédito"
        );

        pacote.imprimirResumo(3); // Exemplo: 3 parcelas no crédito
    }
}
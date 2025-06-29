package Atividade_10;

import java.util.List;

public class PacoteViagemFacade{
    private List<Cliente> clientes;
    private PassagemAerea passagem;
    private ReservaHotel hotel;
    private AluguelCarro carro;
    private Pagamento pagamento;

    public PacoteViagemFacade(List<Cliente> clientes, String assento, String tipoQuarto, String tipoCarro, String formaPagamento) {
        this.clientes = clientes;
        this.passagem = new PassagemAerea(assento);
        this.hotel = new ReservaHotel(tipoQuarto, clientes.size());
        this.carro = new AluguelCarro(tipoCarro);
        double valorPacote = passagem.getPreco() + hotel.getPrecoTotal() + carro.getPreco();
        this.pagamento = new Pagamento(formaPagamento, valorPacote);
    }

    public void imprimirResumo(int parcelas) {
        System.out.println("=== Dados dos Clientes ===");
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + ", CPF: " + c.getCpf());
        }

        System.out.println("\n=== Dados do Pacote ===");
        System.out.println("Assento: " + passagem.getAssento() + " (" + passagem.getClasseVoo() + ")");
        System.out.println("Hotel: " + hotel.getTipoQuarto());
        System.out.println("Carro: " + carro.getTipoCarro());
        System.out.println("Forma de Pagamento: " + pagamento.getForma());

        double total = pagamento.calcularValorFinal(parcelas);
        System.out.printf("Valor Original: R$ %.2f%n", pagamento.valorOriginal);
        System.out.printf("Valor Final: R$ %.2f%n", total);
    }
}
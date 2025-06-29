package Loja_Esportiva.Model.Camisas;

public class CamisaBotafogo implements Camisa{
    private final String NomeTime = "Botafogo";
    private final String Marca = "Puma";
    
    @Override
    public String getNomeTime() {
        return NomeTime;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Time: " + getNomeTime());
        System.out.println("Fabricante: " + getMarca());
    }

}
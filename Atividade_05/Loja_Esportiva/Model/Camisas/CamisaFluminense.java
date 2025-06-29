package Loja_Esportiva.Model.Camisas;

public class CamisaFluminense implements Camisa{
    private final String NomeTime = "Fluminense";
    private final String Marca = "Umbro";
    
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
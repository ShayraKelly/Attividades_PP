package Loja_Esportiva.Model.Camisas;

public class CamisaFlamengo implements Camisa{
    private final String NomeTime = "Flamengo";
    private final String Marca = "Adidas";
    
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
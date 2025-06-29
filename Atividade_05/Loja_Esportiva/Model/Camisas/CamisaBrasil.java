package Loja_Esportiva.Model.Camisas;

public class CamisaBrasil implements Camisa{
    private final String NomeTime = "Brasil";
    private final String Marca = "Nike";
    
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
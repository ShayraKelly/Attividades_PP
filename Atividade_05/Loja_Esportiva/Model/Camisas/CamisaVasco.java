package Loja_Esportiva.Model.Camisas;
public class CamisaVasco implements Camisa{
    private final String NomeTime = "Vasco";
    private final String Marca = "Kappa";
    
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
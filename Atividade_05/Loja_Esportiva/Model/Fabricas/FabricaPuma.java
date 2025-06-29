package Loja_Esportiva.Model.Fabricas;
import Loja_Esportiva.Model.Camisas.CamisaBotafogo;
import Loja_Esportiva.Model.Camisas.Camisa;

public class FabricaPuma extends Fabrica{
    @Override
    public Camisa criarCamisa(){
        return new CamisaBotafogo();
    }
}
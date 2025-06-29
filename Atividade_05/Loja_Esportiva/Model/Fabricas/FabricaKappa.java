package Loja_Esportiva.Model.Fabricas;
import Loja_Esportiva.Model.Camisas.CamisaVasco;
import Loja_Esportiva.Model.Camisas.Camisa;

public class FabricaKappa extends Fabrica{
    @Override
    public Camisa criarCamisa(){
        return new CamisaVasco();
    }
}
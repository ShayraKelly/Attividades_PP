package Loja_Esportiva.Model.Fabricas;
import Loja_Esportiva.Model.Camisas.CamisaFluminense;
import Loja_Esportiva.Model.Camisas.Camisa;

public class FabricaUmbro extends Fabrica{
    @Override
    public Camisa criarCamisa(){
        return new CamisaFluminense();
    }
}
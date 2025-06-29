package Loja_Esportiva.Model.Fabricas;

import Loja_Esportiva.Model.Camisas.CamisaFlamengo;
import Loja_Esportiva.Model.Camisas.Camisa;

public class FabricaAdidas extends Fabrica{
    @Override
    public Camisa criarCamisa(){
        return new CamisaFlamengo();
    }
}

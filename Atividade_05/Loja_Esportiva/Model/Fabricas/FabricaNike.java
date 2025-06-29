package Loja_Esportiva.Model.Fabricas;

import Loja_Esportiva.Model.Camisas.CamisaBrasil;
import Loja_Esportiva.Model.Camisas.Camisa;

public class FabricaNike extends Fabrica{
    @Override
    public Camisa criarCamisa(){
        return new CamisaBrasil();
    }
}
package Loja_Esportiva.Controller;

import Loja_Esportiva.Model.Camisas.Camisa;
import Loja_Esportiva.Model.Fabricas.*;
import Loja_Esportiva.View.LojaView;

public class LojaController {
    private LojaView view;

    public LojaController(LojaView view){
        this.view = view;
    }

    public void iniciar(){
        int escolha;
        do{
            escolha = view.exibirMenuEObterEscolha();
            processarEscolha(escolha);
        } while (escolha != 0);
        view.exibirMensagem("Obrigado por visitar a Loja de camisas esportivas da Shayra!");
        view.fecharScanner();
    }

    public void processarEscolha(int escolha){
        Fabrica fabrica = null;
        String nomeFabrica = "";

        switch (escolha) {
            case 1:
                fabrica = new FabricaNike();
                nomeFabrica = "Nike";
                break;
            case 2:
                fabrica = new FabricaAdidas();
                nomeFabrica = "Adidas";
                break;
            case 3:
                fabrica = new FabricaPuma();
                nomeFabrica = "Puma";
                break;
            case 4:
                fabrica = new FabricaUmbro();
                nomeFabrica = "Umbro";
                break;
            case 5:
                fabrica = new FabricaKappa();
                nomeFabrica = "Kappa";
                break;
            case 0:
            return;
            default:
                view.exibirMensagem("\nA opção selecionada é inválida!\n");
                break;
        }
        
        if (fabrica != null) {
            Camisa camisa = fabrica.criarCamisa();
            view.exibirMensagem("\nCamisa criada pela fábrica: " + nomeFabrica + "\n");
            view.exibirDetalhes(camisa);
        }
    }
}
package Loja_Esportiva;

import Loja_Esportiva.Controller.LojaController;
import Loja_Esportiva.View.LojaView;

public class Main {
    public static void main(String[] args) {
        LojaView view = new LojaView();
        LojaController controller = new LojaController(view);

        controller.iniciar();
    }
}
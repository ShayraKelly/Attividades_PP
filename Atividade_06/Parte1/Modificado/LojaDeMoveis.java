package Parte1.Modificado;

public class LojaDeMoveis{
    public static void main(String[] args) {
        MovelFactory fabrica = new FabricaModerna();
        Cadeira cadeira = fabrica.criarCadeira();
        Sofa sofa = fabrica.criarSofa();
        Poltrona poltrona = fabrica.criarPoltrona();

        cadeira.sentar();
        sofa.deitar();
        poltrona.relaxar();

        fabrica = new FabricaClassica();
        cadeira = fabrica.criarCadeira();
        sofa = fabrica.criarSofa();
        poltrona = fabrica.criarPoltrona();

        cadeira.sentar();
        sofa.deitar();
        poltrona.relaxar();
    }
}
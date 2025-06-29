public class LojaDeMoveis {
    public static void main(String[] args) {
        MovelFactory fabrica = new FabricaModerna();
        Cadeira cadeira = fabrica.criarCadeira();
        Sofa sofa = fabrica.criarSofa();

        cadeira.sentar();
        sofa.deitar();

        fabrica = new FabricaClassica();
        cadeira = fabrica.criarCadeira();
        sofa = fabrica.criarSofa();

        cadeira.sentar();
        sofa.deitar();
    }
}
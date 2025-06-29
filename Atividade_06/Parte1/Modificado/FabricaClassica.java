package Parte1.Modificado;

class FabricaClassica implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }
    public Sofa criarSofa() {
        return new SofaClassico();
    }
    public Poltrona criarPoltrona() {
        return new PoltronaClassica();
    }
}
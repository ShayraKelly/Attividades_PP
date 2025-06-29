package Parte1.Modificado;

class FabricaModerna implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }
    public Sofa criarSofa() {
        return new SofaModerno();
    }
    public Poltrona criarPoltrona() {
        return new PoltronaModerna();
    }
}
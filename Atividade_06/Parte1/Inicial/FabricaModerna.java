class FabricaModerna implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }
    public Sofa criarSofa() {
        return new SofaModerno();
    }
}
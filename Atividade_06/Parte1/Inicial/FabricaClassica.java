class FabricaClassica implements MovelFactory {
    public Cadeira criarCadeira() {
        return new CadeiraClassica();
    }
    
    public Sofa criarSofa() {
        return new SofaClassico();
    }
}
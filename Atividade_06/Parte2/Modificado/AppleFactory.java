package Parte2.Modificado;

class AppleFactory implements EletronicoFactory{
    public Smartphone criarSmartphone() {
        return new SmartphoneApple();
    }
    public Notebook criarNotebook() {
        return new NotebookApple();
    }
}
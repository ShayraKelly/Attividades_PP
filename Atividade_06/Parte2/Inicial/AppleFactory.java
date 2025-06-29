package Parte2.Inicial;

class AppleFactory implements EletronicoFactory{
    public Smartphone criarSmartphone() {
        return new SmartphoneApple();
    }
    public Notebook criarNotebook() {
        return new NotebookApple();
    }
}
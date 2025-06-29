package Parte2.Modificado;

class MicrosoftFactory implements EletronicoFactory{
    public Smartphone criarSmartphone() {
        return new SmartphoneMicrosoft();
    }
    public Notebook criarNotebook() {
        return new NotebookMicrosoft();
    }
}
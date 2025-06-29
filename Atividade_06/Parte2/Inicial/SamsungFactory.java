package Parte2.Inicial;

class SamsungFactory implements EletronicoFactory{
    public Smartphone criarSmartphone() {
        return new SmartphoneSamsung();
    }
    public Notebook criarNotebook() {
        return new NotebookSamsung();
    }
}
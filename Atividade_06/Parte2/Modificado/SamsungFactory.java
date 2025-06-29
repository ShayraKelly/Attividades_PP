package Parte2.Modificado;

class SamsungFactory implements EletronicoFactory{
    public Smartphone criarSmartphone() {
        return new SmartphoneSamsung();
    }
    public Notebook criarNotebook() {
        return new NotebookSamsung();
    }
}
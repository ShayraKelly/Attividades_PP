package Parte2.Inicial;

public class LojaEletronicos{
    public static void main(String[] args) {
        EletronicoFactory apple = new AppleFactory();
        apple.criarSmartphone().ligar();
        apple.criarNotebook().iniciar();

        EletronicoFactory samsung = new SamsungFactory();
        samsung.criarSmartphone().ligar();
        samsung.criarNotebook().iniciar();
    }
}
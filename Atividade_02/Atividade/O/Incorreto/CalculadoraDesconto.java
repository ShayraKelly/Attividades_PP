//Open/Closed Principle (OCP) - Princípio do Aberto/Fechado

package Atividade_02.Atividade.O.Incorreto;

public class CalculadoraDesconto{
    public double calcularDesconto(String tipo) {
        if (tipo.equals("ESTUDANTE")) {
            return 0.2;
        } else if (tipo.equals("IDOSO")) {
            return 0.3;
        } else {
            return 0;
        }
    }
}
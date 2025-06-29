//Open/Closed Principle (OCP) - Princípio do Aberto/Fechado

package Atividade_02.Atividade.O.Correto;

class CalculadoraDesconto {
    public double calcular(Desconto desconto) {
        return desconto.obterDesconto();
    }
}
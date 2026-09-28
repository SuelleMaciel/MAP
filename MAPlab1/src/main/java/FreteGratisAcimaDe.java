package main.java;

// Desafio extra
public class FreteGratisAcimaDe implements FreteStrategy {
    private final FreteStrategy estrategiaBase;
    private final double valorCompra;
    private final double valorMinimo;

    public FreteGratisAcimaDe(FreteStrategy estrategiaBase, double valorCompra, double valorMinimo) {
        this.estrategiaBase = estrategiaBase;
        this.valorCompra = valorCompra;
        this.valorMinimo = valorMinimo;
    }

    @Override
    public double calcularFrete(double peso) {
        if (valorCompra > valorMinimo) {
            return 0;
        }
        return estrategiaBase.calcularFrete(peso);
    }
}

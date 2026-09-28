package main.java;

public class TransportadoraExpressa implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 7 + 50;
    }
}

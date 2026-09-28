package main.java;

public class Pac implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 2 + 10;
    }
}

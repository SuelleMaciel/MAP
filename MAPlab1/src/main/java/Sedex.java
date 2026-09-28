package main.java;

public class Sedex implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 5 + 20;
    }
}

package main.java;

// Context
public class Pedido {
    private final double peso;
    private FreteStrategy estrategiaFrete;

    public Pedido(double peso, FreteStrategy estrategiaFrete) {
        this.peso = peso;
        this.estrategiaFrete = estrategiaFrete;
    }

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        if (estrategiaFrete == null) {
            throw new IllegalStateException("Não foi definida nenhuma estratégia de frete");
        }
        return estrategiaFrete.calcularFrete(peso);
    }

    public double getPeso() {
        return peso;
    }
}

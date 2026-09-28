package main.java;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10, new Sedex());
        System.out.println("SEDEX: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new Pac());
        System.out.println("PAC: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new RetiradaNaLoja());
        System.out.println("Retirada na loja: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new TransportadoraExpressa());
        System.out.println("Transportadora Expressa: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FreteInternacional());
        System.out.println("Internacional: R$ " + pedido.calcularFrete());

        // Desafio extra
        System.out.println("\n--- Promoção: frete grátis acima de R$ 399 ---");
        pedido.setEstrategiaFrete(new FreteGratisAcimaDe(new Sedex(), 450.0, 399.0));
        System.out.println("SEDEX (compra de R$ 450): R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FreteGratisAcimaDe(new Sedex(), 200.0, 399.0));
        System.out.println("SEDEX (compra de R$ 200): R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FreteGratisAcimaDe(new FreteInternacional(), 500.0, 399.0));
        System.out.println("Internacional (compra de R$ 500): R$ " + pedido.calcularFrete());
    }
}

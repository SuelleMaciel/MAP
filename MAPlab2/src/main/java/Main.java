package main.java;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        ClienteApp cliente = new ClienteApp();
        EntregadorApp entregador = new EntregadorApp();
        RestaurantePainel restaurante = new RestaurantePainel();

        pedido.registerObserverder(cliente);
        pedido.registerObserverder(entregador);
        pedido.registerObserverder(restaurante);

        pedido.setStatus(StatusPedido.PREPARANDO);
        System.out.println();
        pedido.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        System.out.println();
        pedido.setStatus(StatusPedido.ENTREGUE);

    }
}

package main.java;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private StatusPedido statusPedido;

    @Override
    public void registerObserverder(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    void setStatus(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
        notifyObservers();
    }
    public StatusPedido getStatus(){
        return statusPedido;
    }
}

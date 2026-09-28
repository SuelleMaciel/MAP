package main.java;

import main.java.Observer;

public interface Subject {
    void registerObserverder(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

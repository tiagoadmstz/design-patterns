package io.github.tiagoadmstz.designpatterns.observer;

public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}

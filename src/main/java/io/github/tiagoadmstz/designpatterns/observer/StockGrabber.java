package io.github.tiagoadmstz.designpatterns.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice, aaplPrice, googPrice;

    public StockGrabber() {
        this.observers = new ArrayList();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println(String.format("Observer %s deleted", observerIndex + 1));
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice, aaplPrice, googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

}

package io.github.tiagoadmstz.designpatterns.observer;

public class StockObserver implements Observer {

    private double ibmPrice, aaplPrice, googPrice;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println(String.format("New Observer %s", this.observerID));
        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println(String.format("%s \nIBM: %s\nAAPL: %s\nGOOG: %s\n", observerID, ibmPrice, aaplPrice, googPrice));
    }

}

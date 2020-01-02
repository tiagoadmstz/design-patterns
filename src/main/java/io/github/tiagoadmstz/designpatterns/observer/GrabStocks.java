package io.github.tiagoadmstz.designpatterns.observer;

import java.util.Arrays;

public class GrabStocks {

    public static void main(String[] args) {
        new GrabStocks().start();
    }

    public void start(){
        StockGrabber stockGrabber = new StockGrabber();
        observerTestOne(stockGrabber);
        observerTestTwo(stockGrabber);
    }

    public void observerTestOne(StockGrabber stockGrabber){
        StockObserver observer1 = new StockObserver(stockGrabber);
        setPrices(stockGrabber, 197.00, 677.60, 676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);
        setPrices(stockGrabber, 197.00, 677.60, 676.40);

        stockGrabber.unregister(observer1);

        setPrices(stockGrabber, 197.00, 677.60, 676.40);
    }

    public void observerTestTwo(StockGrabber stockGrabber, Observer... observers){
        Arrays.asList(
                new GetTheStock(stockGrabber, 2, "IBM", 197.00),
                new GetTheStock(stockGrabber, 2, "AAPL", 677.90),
                new GetTheStock(stockGrabber, 2, "GOOG", 676.40)
        ).stream().map(Thread::new).forEach(Thread::start);
    }

    public void setPrices(StockGrabber stockGrabber, double ibmPrice, double aaplPrice, double googPrice) {
        stockGrabber.setIbmPrice(ibmPrice);
        stockGrabber.setAaplPrice(aaplPrice);
        stockGrabber.setGoogPrice(googPrice);
    }

}

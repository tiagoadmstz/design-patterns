package io.github.tiagoadmstz.designpatterns.observer;

import lombok.SneakyThrows;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.stream.IntStream;

public class GetTheStock implements Runnable {

    private Subject stockGrabber;
    private int startTime;
    private String stock;
    private double price;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @SneakyThrows
    private void updatePrice(int i) {
        Thread.sleep(startTime * 1000);
        double randNum = (Math.random() * (.06)) - .03;
        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
        price = Double.parseDouble(df.format((price + randNum)));
        updateStockPrices(stock, price);
        System.out.println(String.format("%s: %s %s", stock, df.format(price), df.format(randNum)));
        System.out.println();
    }

    private void updateStockPrices(String stock, double price) {
        if ("IBM".equals(stock)) ((StockGrabber) stockGrabber).setIbmPrice(price);
        if ("AAPL".equals(stock)) ((StockGrabber) stockGrabber).setAaplPrice(price);
        if ("GOOG".equals(stock)) ((StockGrabber) stockGrabber).setGoogPrice(price);
    }

    @Override
    public void run() {
        IntStream.rangeClosed(1, 5).forEach(this::updatePrice);
    }

}

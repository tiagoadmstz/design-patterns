package io.github.tiagoadmstz.designpatterns.visitor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TaxVisitor implements Visitor {

    DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));

    public TaxVisitor() {
    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item: Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item: Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity item: Price with Tax");
        return Double.parseDouble(df.format((necessityItem.getPrice() * 0) + necessityItem.getPrice()));
    }
}

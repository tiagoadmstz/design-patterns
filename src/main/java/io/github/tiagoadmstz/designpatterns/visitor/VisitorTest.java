package io.github.tiagoadmstz.designpatterns.visitor;

import java.util.Arrays;

public class VisitorTest {

    public static void main(String[] args) {
        new VisitorTest().start();
    }

    public void start() {
        printVisitor(new TaxVisitor());
        System.out.println(String.format("TAX HOLIDAY PRICES\n"));
        printVisitor(new TaxHolidayVisitor());
    }

    public void printVisitor(Visitor visitor) {
        Arrays.asList(new Necessity(3.47), new Liquor(11.99), new Tobacco(19.99)).forEach(visitable -> acceptVisitors(visitable, visitor));
    }

    public void acceptVisitors(Visitable visitable, Visitor visitor) {
        System.out.println(String.format("%s \n", visitable.accept(visitor)));
    }

}

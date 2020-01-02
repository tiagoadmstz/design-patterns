package io.github.tiagoadmstz.designpatterns.visitor;

import lombok.Getter;

public class Necessity implements Visitable{

    @Getter
    private double price;

    public Necessity(double item) {
        this.price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

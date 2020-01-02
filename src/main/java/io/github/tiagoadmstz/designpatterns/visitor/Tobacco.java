package io.github.tiagoadmstz.designpatterns.visitor;

import lombok.Getter;

public class Tobacco implements Visitable {

    @Getter
    private double price;

    public Tobacco(double item) {
        this.price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

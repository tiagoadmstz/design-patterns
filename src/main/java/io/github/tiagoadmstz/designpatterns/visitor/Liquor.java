package io.github.tiagoadmstz.designpatterns.visitor;

import lombok.Getter;

public class Liquor implements Visitable {

    @Getter
    private double price;

    public Liquor(double item) {
        this.price = item;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}

package io.github.tiagoadmstz.designpatterns.decorator;

public class PlanPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }

}

package io.github.tiagoadmstz.designpatterns.decorator;

public class PizzaMaker {

    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlanPizza()));
        System.out.println(String.format("Ingredients: %s", basicPizza.getDescription()));
        System.out.println(String.format("Price: %s", basicPizza.getCost()));
    }

}

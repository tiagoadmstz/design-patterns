package io.github.tiagoadmstz.designpatterns.strategy;

public class AnimalPlay {

    public static void main(String[] args) {
        Dog sparky = new Dog();
        Bird tweety = new Bird();
        System.out.println(String.format("Dog: %s", sparky.tryToFly()));
        System.out.println(String.format("Bird: %s", tweety.tryToFly()));
        sparky.setFlyingAbility(new ItFlys());
        System.out.println(String.format("Dog: %s", sparky.tryToFly()));
    }

}

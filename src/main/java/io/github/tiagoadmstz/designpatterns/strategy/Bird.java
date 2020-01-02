package io.github.tiagoadmstz.designpatterns.strategy;

public class Bird extends Animal {

    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}

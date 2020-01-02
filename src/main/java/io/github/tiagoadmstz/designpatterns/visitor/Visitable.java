package io.github.tiagoadmstz.designpatterns.visitor;

public interface Visitable {

    public double accept(Visitor visitor);

}

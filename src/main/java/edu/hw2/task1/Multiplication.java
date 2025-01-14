package edu.hw2.task1;

public record Multiplication(Expr firstN, Expr secondN) implements Expr {

    @Override
    public double evaluate() {

        return firstN.evaluate() * secondN.evaluate();
    }
}

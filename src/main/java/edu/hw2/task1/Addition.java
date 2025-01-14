package edu.hw2.task1;

public record Addition(Expr firstNumber, Expr secondNumber) implements Expr {

    @Override
    public double evaluate() {
        return firstNumber.evaluate() + secondNumber.evaluate();
    }
}

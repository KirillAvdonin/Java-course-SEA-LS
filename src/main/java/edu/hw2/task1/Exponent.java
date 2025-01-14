package edu.hw2.task1;

public record Exponent(Expr number, Expr degree) implements Expr {

    @Override
    public double evaluate() {
        return Math.pow(number.evaluate(), degree.evaluate());
    }
}

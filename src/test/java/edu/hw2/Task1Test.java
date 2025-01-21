package edu.hw2;

import edu.hw2.task1.Addition;
import edu.hw2.task1.Constant;
import edu.hw2.task1.Exponent;
import edu.hw2.task1.Expr;
import edu.hw2.task1.Multiplication;
import edu.hw2.task1.Negate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {
    @Test
    @DisplayName("Testing the creation of constant records")
    public void constantRecordTest() {
        Constant constant = new Constant(4);

        Assertions.assertEquals(4.0,constant.evaluate());
    }
    @Test
    @DisplayName("Testing the creation of negate records")
    public void negateRecordTest() {
        Negate neg = new Negate(new Constant(5));

        Assertions.assertEquals(-5.0,neg.evaluate());
    }
    @Test
    @DisplayName("Testing the creation of addition records")
    public void additionRecordTest() {
        Addition add = new Addition(new Constant(5), new Constant(25));

        Assertions.assertEquals(30.0,add.evaluate());
    }
    @Test
    @DisplayName("Testing the creation of multiplication records")
    public void multiplicationRecordTest() {
       Multiplication mult = new Multiplication(new Constant(5), new Constant(25));

        Assertions.assertEquals(125.0,mult.evaluate());
    }
    @Test
    @DisplayName("Testing the creation of exponent records")
    public void exponentRecordTest() {
        Exponent exp = new Exponent(new Constant(6),new Constant(2));

        Assertions.assertEquals(36.0,exp.evaluate());
    }
    @Test
    @DisplayName("Testing the creation of a complex expression records")
    public void testComplexExpression() {
        Expr complexExpr = new Addition(
            new Multiplication(new Constant(2.0), new Constant(3.0)),
            new Negate(new Constant(1.0))
        );

        Assertions.assertEquals(5.0, complexExpr.evaluate());
    }
}


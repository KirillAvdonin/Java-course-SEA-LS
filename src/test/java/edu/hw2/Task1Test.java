package edu.hw2;

import edu.hw2.task1.Addition;
import edu.hw2.task1.Constant;
import edu.hw2.task1.Exponent;
import edu.hw2.task1.Multiplication;
import edu.hw2.task1.Negate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task1Test {
    @Test
    public void constantRecordTest() {
       assertEquals(4.0, new Constant(4).evaluate());
    }

    @Test
    public void negateRecordTest() {
        assertEquals(-5.0, new Negate(new Constant(5)).evaluate());
    }

    @Test
    public void additionRecordTest() {
        assertEquals(30.0, new Addition(new Constant(5), new Constant(25)).evaluate());
    }

    @Test
    public void multiplicationRecordTest() {
        assertEquals(125.0, new Multiplication(new Constant(5), new Constant(25)).evaluate());
    }

    @Test
    public void exponentRecordTest() {
        assertEquals(36.0, new Exponent(new Constant(6), new Constant(2)).evaluate());
    }

    @Test
    public void testComplexExpression() {
       assertEquals(
            5.0, new Addition(
                new Multiplication(new Constant(2.0), new Constant(3.0)),
                new Negate(new Constant(1.0))
            ).evaluate()
        );
    }
}


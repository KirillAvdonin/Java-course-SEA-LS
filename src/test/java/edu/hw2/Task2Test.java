package edu.hw2;

import edu.hw2.task2.Rectangle;
import edu.hw2.task2.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    public void RectangleConstructorAndGetAreaMethodTest() {

        Assertions.assertEquals(8,new Rectangle(2,4).getArea());
        Assertions.assertEquals(156,new Rectangle(78,2).getArea());

    }
    @Test
    public void squareConstructorAndGetAreaMethodTest() {

        Assertions.assertEquals(25,new Square(5).getArea());
        Assertions.assertEquals(100,new Square(10).getArea());
    }


}



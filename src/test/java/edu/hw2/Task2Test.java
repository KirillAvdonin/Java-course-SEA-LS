package edu.hw2;

import edu.hw2.task1.Constant;
import edu.hw2.task2.Rectangle;
import edu.hw2.task2.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task2Test {
    @Test
    @DisplayName("Testing the rectangle constructor and getArea() method")
    public void RectangleConstructorAndGetAreaMethodTest() {
        Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(78,2);

        Assertions.assertEquals(8,rectangle1.getArea());
        Assertions.assertEquals(156,rectangle2.getArea());

    }
    @Test
    @DisplayName("Testing the square constructor and getArea() method")
    public void squareConstructorAndGetAreaMethodTest() {
        Square square1 = new Square(5);
        Square square2 = new Square(10);

        Assertions.assertEquals(25,square1.getArea());
        Assertions.assertEquals(100,square2.getArea());
    }


}



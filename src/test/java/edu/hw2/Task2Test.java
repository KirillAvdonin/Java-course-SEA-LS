package edu.hw2;

import edu.hw2.task2.Rectangle;
import edu.hw2.task2.Square;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Task2Test {
    @Test
    public void RectangleConstructorAndGetAreaMethodTest() {
        assertEquals(8, new Rectangle(2, 4).getArea());
        assertEquals(156, new Rectangle(78, 2).getArea());
    }

    @Test
    public void squareConstructorAndGetAreaMethodTest() {
        assertEquals(25, new Square(5).getArea());
        assertEquals(100, new Square(10).getArea());
    }

}



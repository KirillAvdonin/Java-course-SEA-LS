package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw1.Task2.countDigits;
class Task2Test {
    @Test
    void countDigitsTest1() {
        assertEquals(4, countDigits(4666));
    }

    @Test
    void countDigitsTest2() {
        assertEquals(3, countDigits(544));
    }

    @Test
    void countDigitsTest3() {
        assertEquals(1, countDigits(0));
    }
}

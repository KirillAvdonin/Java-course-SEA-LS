package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {
    @Test
    void countDigitsTest1() {

        Assertions.assertEquals(4, Task2.countDigits(4666));
    }

    @Test
    void countDigitsTest2() {

        Assertions.assertEquals(3, Task2.countDigits(544));
    }

    @Test
    void countDigitsTest3() {

        Assertions.assertEquals(1, Task2.countDigits(0));
    }
}

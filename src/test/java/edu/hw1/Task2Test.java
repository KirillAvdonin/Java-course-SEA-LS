package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task2Test {
    @Test
    @DisplayName("Длина видео в секундах")
    void countDigitsTest1() {
        int test1 = Task2.countDigits(4666);
        Assertions.assertEquals(4, test1);
    }

    @Test
    @DisplayName("Длина видео в секундах")
    void countDigitsTest2() {
        int test2 = Task2.countDigits(544);
        Assertions.assertEquals(3, test2);
    }

    @Test
    @DisplayName("Длина видео в секундах")
    void countDigitsTest3() {
        int test3 = Task2.countDigits(0);
        Assertions.assertEquals(1, test3);
    }
}

package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task1Test {
    @Test
    @DisplayName("Длина видео в секундах 1 тест")
    void VideosLengthTest1() {
        int test1 = Task1.minutesToSeconds("01:00");
        Assertions.assertEquals(60, test1);
    }

    @Test
    @DisplayName("Длина видео в секундах 2 тест")
    void VideosLengthTest2() {
        int test2 = Task1.minutesToSeconds("13:56");
        Assertions.assertEquals(836, test2);
    }

    @Test
    @DisplayName("Длина видео в секундах 3 тест")
    void VideosLengthTest3() {
        int test3 = Task1.minutesToSeconds("10:60");
        Assertions.assertEquals(-1, test3);
    }
}

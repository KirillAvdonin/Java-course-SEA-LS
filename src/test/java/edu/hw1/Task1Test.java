package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    @Test
    void VideosLengthTest1() {

        Assertions.assertEquals(60, Task1.minutesToSeconds("01:00"));
    }

    @Test
    void VideosLengthTest2() {

        Assertions.assertEquals(836, Task1.minutesToSeconds("13:56"));
    }

    @Test
    void VideosLengthTest3() {

        Assertions.assertEquals(-1, Task1.minutesToSeconds("10:60"));
    }
}

package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    void CyclicBitShiftFirst() {

        Assertions.assertEquals(4, Task7.rotateRight(8, 1));
    }

    @Test
    void CyclicBitShiftSecond() {

        Assertions.assertEquals(1, Task7.rotateLeft(16, 1));
    }

    @Test
    void CyclicBitShiftThird() {

        Assertions.assertEquals(6, Task7.rotateLeft(17, 2));
    }

}

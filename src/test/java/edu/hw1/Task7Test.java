package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw1.Task7.rotateLeft;
import static edu.hw1.Task7.rotateRight;

class Task7Test {
    @Test
    void CyclicBitShiftTest1() {
        assertEquals(4, rotateRight(8, 1));
    }

    @Test
    void CyclicBitShiftTest2() {
        assertEquals(1, rotateLeft(16, 1));
    }

    @Test
    void CyclicBitShiftTest3() {
        assertEquals(6, rotateLeft(17, 2));
    }

    @Test
    void CyclicBitShiftTest4() {
        assertEquals(2, rotateLeft(8, 10));
    }

    @Test
    void CyclicBitShiftTest5() {
        assertEquals(5, rotateRight(10, 11));
    }

}

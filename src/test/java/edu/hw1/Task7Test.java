package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task7Test {
    @Test
    @DisplayName("Циклический сдвиг")
    void CyclicBitShiftFirst() {
        int cyclicShift1 = Task7.rotateRight(8, 1);
        Assertions.assertEquals(4, cyclicShift1);
    }

    @Test
    @DisplayName("Циклический сдвиг")
    void CyclicBitShiftSecond() {
        int cyclicShift2 = Task7.rotateLeft(16, 1);
        Assertions.assertEquals(1, cyclicShift2);
    }

    @Test
    @DisplayName("Циклический сдвиг")
    void CyclicBitShiftThird() {
        int cyclicShift3 = Task7.rotateLeft(17, 2);
        Assertions.assertEquals(6, cyclicShift3);
    }

}

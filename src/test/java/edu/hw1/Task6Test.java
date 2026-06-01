package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw1.Task6.countK;

class Task6Test {
    @Test
    void kaprekarsConstantFirstTest() {
        assertEquals(3, countK(3524));
    }

    @Test
    void kaprekarsConstantSecondTest() {
        assertEquals(5, countK(6621));
    }

    @Test
    void kaprekarsConstantThirirdTest() {
        assertEquals(4, countK(6554));
    }

    @Test
    void kaprekarsConstantFourthTest() {
        assertEquals(3, countK(1234));
    }
}



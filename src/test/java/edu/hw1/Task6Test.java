package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    void KaprekarsConstantFirstTest() {

        Assertions.assertEquals(3, Task6.countK(3524));
    }

    @Test
    void KaprekarsConstantSecondTest() {

        Assertions.assertEquals(5, Task6.countK(6621));
    }

    @Test
    void KaprekarsConstantThirirdTest() {

        Assertions.assertEquals(4, Task6.countK(6554));
    }

    @Test
    void KaprekarsConstantFourthTest() {

        Assertions.assertEquals(3, Task6.countK(1234));
    }
}



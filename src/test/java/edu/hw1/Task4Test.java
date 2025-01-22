package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    void BrokenStringFirstTest() {

        Assertions.assertEquals("123456", Task4.fixString("214365"));
    }

    @Test
    void BrokenStringSecondTest() {

        Assertions.assertEquals("This is a mixed up string.", Task4.fixString("hTsii  s aimex dpus rtni.g"));
    }
}

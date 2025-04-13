package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw1.Task4.fixString;

class Task4Test {
    @Test
    void brokenStringTest1() {
        assertEquals("123456", fixString("214365"));
    }

    @Test
    void brokenStringTest2() {
        assertEquals("12345", fixString("21435"));
    }

    @Test
    void brokenStringTest3() {
        assertEquals("This is a mixed up string.", fixString("hTsii  s aimex dpus rtni.g"));
    }
}

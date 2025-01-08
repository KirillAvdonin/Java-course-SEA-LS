package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4Test {
    @Test
    @DisplayName("Починка строк")
    void BrokenStringFirstTest() {
        String test1 = Task4.fixString("214365");
        Assertions.assertEquals("123456", test1);
    }

    @Test
    @DisplayName("Починка строк")
    void BrokenStringSecondTest() {
        String test2 = Task4.fixString("hTsii  s aimex dpus rtni.g");
        Assertions.assertEquals("This is a mixed up string.", test2);
    }
}

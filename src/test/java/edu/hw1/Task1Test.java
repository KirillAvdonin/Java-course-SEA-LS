package edu.hw1;

import org.junit.jupiter.api.Test;
import static edu.hw1.Task1.minutesToSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
class Task1Test {
    @Test
    void videosLengthTest1() {
        assertEquals(60, minutesToSeconds("01:00"));
    }

    @Test
    void videosLengthTest2() {
        assertEquals(836, minutesToSeconds("13:56"));
    }

    @Test
    void videosLengthTest3() {
        assertEquals(-1, minutesToSeconds("10:60"));
    }

    @Test
    void videosLengthTest4() {
        assertThrows(RuntimeException.class,()->minutesToSeconds(null));
    }

    @Test
    void videosLengthTest5() {
        assertThrows(RuntimeException.class,()->minutesToSeconds(""));
    }
}

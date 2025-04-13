package edu.hw1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static edu.hw1.Task3.isNested;

class Task3Test {
    @Test
    void isNestableTest1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {0, 6};

        assertTrue(isNested(a, b));
    }

    @Test
    void isNestableTest2() {
        int[] a = {3, 1};
        int[] b = {4, 0};

        assertTrue(isNested(a, b));
    }

    @Test
    void isNestableTest3() {
        int[] a = {9, 9, 8};
        int[] b = {8, 9};

        assertFalse(isNested(a, b));
    }

    @Test
    void isNestableTest4() {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3};

        assertFalse(isNested(a, b));
    }

    @Test
    void isNestableTest5() {
        assertThrows(RuntimeException.class, () -> isNested(null, new int[] {1, 2, 3}));
    }

    @Test
    void isNestableTest6() {
        assertThrows(RuntimeException.class, () -> isNested(new int[] {1, 2, 3},null));
    }

    @Test
    void isNestableTest7() {
        assertThrows(RuntimeException.class, () -> isNested(new int[]{}, new int[] {1, 2, 3}));
    }

    @Test
    void isNestableTest8() {
        assertThrows(RuntimeException.class, () -> isNested(new int[] {1, 2, 3},new int[]{}));
    }

}

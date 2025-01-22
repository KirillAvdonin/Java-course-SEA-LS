package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    void isNestableTest1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {0, 6};

        Assertions.assertTrue(Task3.isNested(a, b));
    }

    @Test
    void isNestableTest2() {
        int[] a = {3, 1};
        int[] b = {4, 0};

        Assertions.assertTrue(Task3.isNested(a, b));
    }

    @Test
    void isNestableTest3() {
        int[] a = {9, 9, 8};
        int[] b = {8, 9};

        Assertions.assertFalse(Task3.isNested(a, b));
    }

    @Test
    void isNestableTest4() {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3};

        Assertions.assertFalse(Task3.isNested(a, b));
    }
}

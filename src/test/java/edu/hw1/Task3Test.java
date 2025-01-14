package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task3Test {
    @Test
    @DisplayName("Проверка на вложенный массив тест 1")
    void isNestableTest1() {
        int[] a = {1, 2, 3, 4};
        int[] b = {0, 6};
        boolean test1 = Task3.isNested(a, b);
        Assertions.assertTrue(test1);
    }

    @Test
    @DisplayName("Проверка на вложенный массив тест 2")
    void isNestableTest2() {
        int[] a = {3, 1};
        int[] b = {4, 0};
        boolean test2 = Task3.isNested(a, b);
        Assertions.assertTrue(test2);
    }

    @Test
    @DisplayName("Проверка на вложенный массив тест 3")
    void isNestableTest3() {
        int[] a = {9, 9, 8};
        int[] b = {8, 9};
        boolean test3 = Task3.isNested(a, b);
        Assertions.assertFalse(test3);
    }

    @Test
    @DisplayName("Проверка на вложенный массив тест 4")
    void isNestableTest4() {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3};
        boolean test4 = Task3.isNested(a, b);
        Assertions.assertFalse(test4);
    }
}

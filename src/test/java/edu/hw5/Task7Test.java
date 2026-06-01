package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.hw5.Task7.AllTasksForSevenTask.task1;
import static edu.hw5.Task7.AllTasksForSevenTask.task2;
import static edu.hw5.Task7.AllTasksForSevenTask.task3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task7Test {
    @ParameterizedTest
    @CsvSource({
        "000, true",
        "100, true",
        "0101, true",
        "11000, true",
        "00, false",
        "10, false",
        "011, false",
        "111, false",
        "001, false",
        "101, false"
    })
    @DisplayName("Task 1: Строка содержит не менее 3 символов, причем третий символ равен 0")
    void task1_test(String input, boolean expected) {
        assertEquals(expected,task1(input));
    }

    @ParameterizedTest
    @CsvSource({
        "00, true",
        "11, true",
        "010, true",
        "101, true",
        "0000, true",
        "1111, true",
        "01110, true",
        "10001, true",
        "01, false",
        "10, false",
        "011, false",
        "100, false",
        "0101, false",
        "1010, false"
    })
    @DisplayName("Task 2: Строка начинается и заканчивается одним и тем же символом")
    void task2_test(String input, boolean expected) {
        assertEquals(expected,task2(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "1", "00", "01", "10", "11", "000", "001", "010", "011", "100", "101", "110", "111"})
    @DisplayName("Task 3: Длина строки не менее 1 и не более 3 (True cases)")
    void task3_test_true(String input) {
        assertTrue(task3(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "0000", "1111", "01010"})
    @DisplayName("Task 3: Длина строки не менее 1 и не более 3 (False cases)")
    void task3_test_false(String input) {
        assertFalse(task3(input));
    }
}

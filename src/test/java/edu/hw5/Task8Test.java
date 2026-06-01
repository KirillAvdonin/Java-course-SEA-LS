package edu.hw5;

import edu.hw5.Task8.AllTasksForEighthTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static edu.hw5.Task8.AllTasksForEighthTask.task1;
import static edu.hw5.Task8.AllTasksForEighthTask.task2;
import static edu.hw5.Task8.AllTasksForEighthTask.task3;
import static edu.hw5.Task8.AllTasksForEighthTask.task4;
import static edu.hw5.Task8.AllTasksForEighthTask.task5;
import static edu.hw5.Task8.AllTasksForEighthTask.task6;
import static edu.hw5.Task8.AllTasksForEighthTask.task7;
import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @ParameterizedTest
    @CsvSource({
        "00, true",
        "01, true",
        "10, true",
        "11, true",
        "0000, true",
        "0110, true",
        "0, false",
        "1, false",
        "000, false",
        "111, false"
    })
    @DisplayName("Task 1: Строка имеет четную длину")
    void task1_test(String input, boolean expected) {
        assertEquals(expected, task1(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0, true",
        "000, true",
        "011, true",
        "10, true",
        "1100, true",
        "1010, true",
        "1, false",
        "00, false",
        "0000, false",
        "111, false"
    })
    @DisplayName("Task 2: Строка начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void task2_test(String input, boolean expected) {
        assertEquals(expected,task2(input));
    }

    @ParameterizedTest
    @CsvSource({
        "1, true",
        "111, true",
        "000, true",
        "1010101, true",
        "011010, true",
        "000111, true",
        "0, false",
        "00, false",
        "10, false",
        "0000, false",
        "00000, false"
    })
    @DisplayName("Task 3: Количество нулей кратно 3")
    void task3_test(String input, boolean expected) {
        assertEquals(expected,task3(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0, true",
        "00, true",
        "01, true",
        "10, true",
        "000, true",
        "011, true",
        "100, true",
        "110, true",
        "1111, true",
        "0111, true",
        "11, false",
        "111, false"
    })
    @DisplayName("Task 4: Любая строка, кроме '11' или '111'")
    void task4_test(String input, boolean expected) {
        assertEquals(expected, task4(input));
    }

    @ParameterizedTest
    @CsvSource({
        "1, true",
        "100, true",
        "101, true",
        "110, true",
        "111, true",
        "10001, true",
        "10101, true",
        "11011, true",
        "11111, true",
        "0, false",
        "01, false",
        "000, false",
        "1001, false"
    })
    @DisplayName("Task 5: Каждый нечетный символ равен 1")
    void task5_test(String input, boolean expected) {
        assertEquals(expected, task5(input));
    }

    @ParameterizedTest
    @CsvSource({
        "00, true",
        "000, true",
        "001, true",
        "100, true",
        "0001, true",
        "0100, true",
        "1000, true",
        "0, false",
        "1, false",
        "011, false",
        "101, false",
        "110, false",
        "0011, false"
    })
    @DisplayName("Task 6: Содержит не менее двух 0 и не более одной 1")
    void task6_test(String input, boolean expected) {
        assertEquals(expected, task6(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0, true",
        "1, true",
        "00, true",
        "01, true",
        "10, true",
        "000, true",
        "001, true",
        "010, true",
        "100, true",
        "0101, true",
        "1010, true",
        "01010, true",
        "10101, true",
        "11, false",
        "011, false",
        "110, false",
        "111, false",
        "0011, false",
        "10110, false"
    })
    @DisplayName("Task 7: Не содержит последовательных 1")
    void task7_test(String input, boolean expected) {
        assertEquals(expected, task7(input));
    }
}

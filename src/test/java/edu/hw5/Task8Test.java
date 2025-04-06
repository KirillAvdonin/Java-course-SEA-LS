package edu.hw5;
import edu.hw5.Task8.AllTasksForEighthTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @Test
    @DisplayName("Task 1: Строка имеет четную длину")
    void task1_test() {
        assertTrue(AllTasksForEighthTask.task1(""));
        assertTrue(AllTasksForEighthTask.task1("00"));
        assertTrue(AllTasksForEighthTask.task1("01"));
        assertTrue(AllTasksForEighthTask.task1("10"));
        assertTrue(AllTasksForEighthTask.task1("11"));
        assertTrue(AllTasksForEighthTask.task1("0000"));
        assertTrue(AllTasksForEighthTask.task1("0110"));
        assertFalse(AllTasksForEighthTask.task1("0"));
        assertFalse(AllTasksForEighthTask.task1("1"));
        assertFalse(AllTasksForEighthTask.task1("000"));
        assertFalse(AllTasksForEighthTask.task1("111"));
    }

    @Test
    @DisplayName("Task 2: Строка начинается с 0 и имеет нечетную длину, или начинается с 1 и имеет четную длину")
    void task2_test() {
        assertTrue(AllTasksForEighthTask.task2("0"));
        assertTrue(AllTasksForEighthTask.task2("000"));
        assertTrue(AllTasksForEighthTask.task2("011"));
        assertTrue(AllTasksForEighthTask.task2("10"));
        assertTrue(AllTasksForEighthTask.task2("1100"));
        assertTrue(AllTasksForEighthTask.task2("1010"));
        assertFalse(AllTasksForEighthTask.task2(""));
        assertFalse(AllTasksForEighthTask.task2("1"));
        assertFalse(AllTasksForEighthTask.task2("00"));
        assertFalse(AllTasksForEighthTask.task2("0000"));
        assertFalse(AllTasksForEighthTask.task2("111"));
    }

    @Test
    @DisplayName("Task 3: Количество нулей кратно 3")
    void task3_test() {
        assertTrue(AllTasksForEighthTask.task3(""));
        assertTrue(AllTasksForEighthTask.task3("1"));
        assertTrue(AllTasksForEighthTask.task3("111"));
        assertTrue(AllTasksForEighthTask.task3("000"));
        assertTrue(AllTasksForEighthTask.task3("1010101"));
        assertTrue(AllTasksForEighthTask.task3("011010"));
        assertTrue(AllTasksForEighthTask.task3("000111"));
        assertFalse(AllTasksForEighthTask.task3("0"));
        assertFalse(AllTasksForEighthTask.task3("00"));
        assertFalse(AllTasksForEighthTask.task3("10"));
        assertFalse(AllTasksForEighthTask.task3("0000"));
        assertFalse(AllTasksForEighthTask.task3("00000"));
    }

    @Test
    @DisplayName("Task 4: Любая строка, кроме '11' или '111'")
    void task4_test() {
        assertTrue(AllTasksForEighthTask.task4(""));
        assertTrue(AllTasksForEighthTask.task4("0"));
        assertTrue(AllTasksForEighthTask.task4("00"));
        assertTrue(AllTasksForEighthTask.task4("01"));
        assertTrue(AllTasksForEighthTask.task4("10"));
        assertTrue(AllTasksForEighthTask.task4("000"));
        assertTrue(AllTasksForEighthTask.task4("011"));
        assertTrue(AllTasksForEighthTask.task4("100"));
        assertTrue(AllTasksForEighthTask.task4("110"));
        assertTrue(AllTasksForEighthTask.task4("1111"));
        assertTrue(AllTasksForEighthTask.task4("0111"));
        assertFalse(AllTasksForEighthTask.task4("11"));
        assertFalse(AllTasksForEighthTask.task4("111"));
    }

    @Test
    @DisplayName("Task 5: Каждый нечетный символ равен 1")
    void task5_test() {
        assertTrue(AllTasksForEighthTask.task5("1"));
        assertTrue(AllTasksForEighthTask.task5("100"));
        assertTrue(AllTasksForEighthTask.task5("101"));
        assertTrue(AllTasksForEighthTask.task5("110"));
        assertTrue(AllTasksForEighthTask.task5("111"));
        assertTrue(AllTasksForEighthTask.task5("10001"));
        assertTrue(AllTasksForEighthTask.task5("10101"));
        assertTrue(AllTasksForEighthTask.task5("11011"));
        assertTrue(AllTasksForEighthTask.task5("11111"));
        assertFalse(AllTasksForEighthTask.task5("0"));
        assertFalse(AllTasksForEighthTask.task5("01"));
        assertFalse(AllTasksForEighthTask.task5("000"));
        assertFalse(AllTasksForEighthTask.task5("1001"));
    }

    @Test
    @DisplayName("Task 6: Содержит не менее двух 0 и не более одной 1")
    void task6_test() {
        assertTrue(AllTasksForEighthTask.task6("00"));
        assertTrue(AllTasksForEighthTask.task6("000"));
        assertTrue(AllTasksForEighthTask.task6("001"));
        assertTrue(AllTasksForEighthTask.task6("100"));
        assertTrue(AllTasksForEighthTask.task6("0001"));
        assertTrue(AllTasksForEighthTask.task6("0100"));
        assertTrue(AllTasksForEighthTask.task6("1000"));
        assertFalse(AllTasksForEighthTask.task6(""));
        assertFalse(AllTasksForEighthTask.task6("0"));
        assertFalse(AllTasksForEighthTask.task6("1"));
        assertFalse(AllTasksForEighthTask.task6("011"));
        assertFalse(AllTasksForEighthTask.task6("101"));
        assertFalse(AllTasksForEighthTask.task6("110"));
        assertFalse(AllTasksForEighthTask.task6("0011"));
    }

    @Test
    @DisplayName("Task 7: Не содержит последовательных 1")
    void task7_test() {
        assertTrue(AllTasksForEighthTask.task7(""));
        assertTrue(AllTasksForEighthTask.task7("0"));
        assertTrue(AllTasksForEighthTask.task7("1"));
        assertTrue(AllTasksForEighthTask.task7("00"));
        assertTrue(AllTasksForEighthTask.task7("01"));
        assertTrue(AllTasksForEighthTask.task7("10"));
        assertTrue(AllTasksForEighthTask.task7("000"));
        assertTrue(AllTasksForEighthTask.task7("001"));
        assertTrue(AllTasksForEighthTask.task7("010"));
        assertTrue(AllTasksForEighthTask.task7("100"));
        assertTrue(AllTasksForEighthTask.task7("0101"));
        assertTrue(AllTasksForEighthTask.task7("1010"));
        assertTrue(AllTasksForEighthTask.task7("01010"));
        assertTrue(AllTasksForEighthTask.task7("10101"));
        assertFalse(AllTasksForEighthTask.task7("11"));
        assertFalse(AllTasksForEighthTask.task7("011"));
        assertFalse(AllTasksForEighthTask.task7("110"));
        assertFalse(AllTasksForEighthTask.task7("111"));
        assertFalse(AllTasksForEighthTask.task7("0011"));
        assertFalse(AllTasksForEighthTask.task7("10110"));
    }
}

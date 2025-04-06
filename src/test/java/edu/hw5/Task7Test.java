package edu.hw5;

import edu.hw5.Task7.AllTasksForSevenTask;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task7Test {
    @Test
    @DisplayName("Task 1: Строка содержит не менее 3 символов, причем третий символ равен 0")
    void task1_test() {
        assertTrue(AllTasksForSevenTask.task1("000"));
        assertTrue(AllTasksForSevenTask.task1("100"));
        assertTrue(AllTasksForSevenTask.task1("0101"));
        assertTrue(AllTasksForSevenTask.task1("11000"));
        assertFalse(AllTasksForSevenTask.task1("00"));
        assertFalse(AllTasksForSevenTask.task1("10"));
        assertFalse(AllTasksForSevenTask.task1("011"));
        assertFalse(AllTasksForSevenTask.task1("111"));
        assertFalse(AllTasksForSevenTask.task1("001"));
        assertFalse(AllTasksForSevenTask.task1("101"));
    }

    @Test
    @DisplayName("Task 2: Строка начинается и заканчивается одним и тем же символом")
    void task2_test() {
        assertTrue(AllTasksForSevenTask.task2("00"));
        assertTrue(AllTasksForSevenTask.task2("11"));
        assertTrue(AllTasksForSevenTask.task2("010"));
        assertTrue(AllTasksForSevenTask.task2("101"));
        assertTrue(AllTasksForSevenTask.task2("0000"));
        assertTrue(AllTasksForSevenTask.task2("1111"));
        assertTrue(AllTasksForSevenTask.task2("01110"));
        assertTrue(AllTasksForSevenTask.task2("10001"));
        assertFalse(AllTasksForSevenTask.task2("01"));
        assertFalse(AllTasksForSevenTask.task2("10"));
        assertFalse(AllTasksForSevenTask.task2("011"));
        assertFalse(AllTasksForSevenTask.task2("100"));
        assertFalse(AllTasksForSevenTask.task2("0101"));
        assertFalse(AllTasksForSevenTask.task2("1010"));
    }

    @Test
    @DisplayName("Task 3: Длина строки не менее 1 и не более 3")
    void task3_test() {
        assertTrue(AllTasksForSevenTask.task3("0"));
        assertTrue(AllTasksForSevenTask.task3("1"));
        assertTrue(AllTasksForSevenTask.task3("00"));
        assertTrue(AllTasksForSevenTask.task3("01"));
        assertTrue(AllTasksForSevenTask.task3("10"));
        assertTrue(AllTasksForSevenTask.task3("11"));
        assertTrue(AllTasksForSevenTask.task3("000"));
        assertTrue(AllTasksForSevenTask.task3("001"));
        assertTrue(AllTasksForSevenTask.task3("010"));
        assertTrue(AllTasksForSevenTask.task3("011"));
        assertTrue(AllTasksForSevenTask.task3("100"));
        assertTrue(AllTasksForSevenTask.task3("101"));
        assertTrue(AllTasksForSevenTask.task3("110"));
        assertTrue(AllTasksForSevenTask.task3("111"));
        assertFalse(AllTasksForSevenTask.task3(""));
        assertFalse(AllTasksForSevenTask.task3("0000"));
        assertFalse(AllTasksForSevenTask.task3("1111"));
        assertFalse(AllTasksForSevenTask.task3("01010"));
    }
}

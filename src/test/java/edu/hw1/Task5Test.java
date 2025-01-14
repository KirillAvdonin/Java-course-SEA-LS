package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    @DisplayName("Проверка на специальный палиндром тест 1")
    void SpecialPalindromeTest1() {
        boolean test1 = Task5.isPalindrome(11211230);
        Assertions.assertTrue(test1);
    }

    @Test
    @DisplayName("Проверка на специальный палиндром тест 1")
    void SpecialPalindromeTest2() {
        boolean test2 = Task5.isPalindrome(13001120);
        Assertions.assertTrue(test2);
    }

    @Test
    @DisplayName("Проверка на специальный палиндром тест 1")
    void SpecialPalindromeTest3() {
        boolean test1 = Task5.isPalindrome(23336014);
        Assertions.assertTrue(test1);
    }

    @Test
    @DisplayName("Проверка на специальный палиндром тест 1")
    void SpecialPalindromeTest4() {
        boolean test1 = Task5.isPalindrome(11);
        Assertions.assertTrue(test1);
    }
}

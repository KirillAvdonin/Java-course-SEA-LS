package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {
    @Test
    void SpecialPalindromeTest1() {
        Assertions.assertTrue(Task5.isPalindrome(11211230));
    }

    @Test
    void SpecialPalindromeTest2() {

        Assertions.assertTrue(Task5.isPalindrome(13001120));
    }

    @Test
    void SpecialPalindromeTest3() {

        Assertions.assertTrue(Task5.isPalindrome(23336014));
    }

    @Test
    void SpecialPalindromeTest4() {

        Assertions.assertTrue(Task5.isPalindrome(11));
    }
}

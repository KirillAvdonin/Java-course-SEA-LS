package edu.hw1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static edu.hw1.Task5.isPalindrome;

class Task5Test {
    @Test
    void specialPalindromeTest1() {
        assertTrue(isPalindrome(11211230));
    }

    @Test
    void specialPalindromeTest2() {
        assertTrue(isPalindrome(13001120));
    }

    @Test
    void specialPalindromeTest3() {
        assertTrue(isPalindrome(23336014));
    }

    @Test
    void specialPalindromeTest4() {
        assertTrue(isPalindrome(11));
    }
}

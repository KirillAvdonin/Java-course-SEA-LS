package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task6Test {
    @Test
    @DisplayName("Вторая строка содержит первую строку как подстроку")
    void isSecondStringContainsFirst_contains() {
        assertTrue(Task6.isSecondStringContainsFirst("abc", "xyzabcv"));
        assertTrue(Task6.isSecondStringContainsFirst("world", "hello world!"));
        assertTrue(Task6.isSecondStringContainsFirst("123", "start123end"));
        assertTrue(Task6.isSecondStringContainsFirst("a", "banana"));
        assertTrue(Task6.isSecondStringContainsFirst("", "any string"));
        assertTrue(Task6.isSecondStringContainsFirst("test", "this is a test."));
    }

    @Test
    @DisplayName("Вторая строка не содержит первую строку")
    void isSecondStringContainsFirst_notContains() {
        assertFalse(Task6.isSecondStringContainsFirst("def", "abc"));
        assertFalse(Task6.isSecondStringContainsFirst("universe", "galaxy"));
        assertFalse(Task6.isSecondStringContainsFirst("456", "123789"));
        assertFalse(Task6.isSecondStringContainsFirst("apple", "apricot"));
        assertFalse(Task6.isSecondStringContainsFirst(" ", ""));
    }

    @Test
    @DisplayName("Первая строка длиннее второй строки")
    void isSecondStringContainsFirst_firstLonger() {
        assertFalse(Task6.isSecondStringContainsFirst("longerstring", "short"));
    }

    @Test
    @DisplayName("Обе строки пустые")
    void isSecondStringContainsFirst_bothEmpty() {
        assertTrue(Task6.isSecondStringContainsFirst("", ""));
    }

    @Test
    @DisplayName("Первая строка содержит специальные символы")
    void isSecondStringContainsFirst_firstHasSpecialChars() {
        assertTrue(Task6.isSecondStringContainsFirst("a.b", "xyz a.b v"));
        assertTrue(Task6.isSecondStringContainsFirst("a*b", "xyz a*b v"));
        assertTrue(Task6.isSecondStringContainsFirst("a?b", "xyz a?b v"));
        assertTrue(Task6.isSecondStringContainsFirst("[ab]", "xyz a v"));
    }

    @Test
    @DisplayName("Вторая строка содержит первую строку с экранированными специальными символами")
    void isSecondStringContainsFirst_firstHasEscapedSpecialChars() {
        assertTrue(Task6.isSecondStringContainsFirst("a\\.b", "xyz a.b v"));
        assertTrue(Task6.isSecondStringContainsFirst("a\\*b", "xyz a*b v"));
        assertTrue(Task6.isSecondStringContainsFirst("a\\+b", "xyz a+b v"));
        assertTrue(Task6.isSecondStringContainsFirst("a\\?b", "xyz a?b v"));
        assertTrue(Task6.isSecondStringContainsFirst("\\[ab\\]", "xyz [ab] v"));
    }

}

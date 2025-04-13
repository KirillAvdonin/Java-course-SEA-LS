package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static edu.hw5.Task6.isSecondStringContainsFirst;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task6Test {
    @ParameterizedTest
    @CsvSource({
            "abc, xyzabcv",
            "world, hello world!",
            "123, start123end",
            "a, banana",
            "test, this is a test.",
            "a.b, xyz a.b v",
            "a*b, xyz a*b v",
            "a?b, xyz a?b v",
            "\\[ab\\], xyz [ab] v",
            "a\\.b, xyz a.b v",
            "a\\*b, xyz a*b v",
            "a\\+b, xyz a+b v",
            "a\\?b, xyz a?b v",
            "\\[ab\\], xyz [ab] v",
    })
    @DisplayName("Вторая строка содержит первую строку как подстроку")
    void isSecondStringContainsFirst_contains(String first, String second) {
        assertTrue(isSecondStringContainsFirst(first, second));
    }

    @ParameterizedTest
    @CsvSource({
            "def, abc",
            "universe, galaxy",
            "456, 123789",
            "apple, apricot",
            "longerstring, short"
    })
    @DisplayName("Вторая строка не содержит первую строку")
    void isSecondStringContainsFirst_notContains(String first, String second) {
        assertFalse(isSecondStringContainsFirst(first, second));
    }
}

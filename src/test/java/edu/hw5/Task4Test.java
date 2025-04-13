package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @ParameterizedTest
    @ValueSource(strings = {"Secure~Password", "Another!One",
            "Has@Symbol", "Check#", "Dollar$", "Percent%", "Caret^",
            "Ampersand&", "Asterisk*", "Vertical|Bar",
            "Pass~word@!", "#$%^&*|", "~Password", "Password~"})
    @DisplayName("Пароль содержит хотя бы один специальный символ")
    void isValidPassword_containsSpecialSymbol(String password) {
        assertTrue(Task4.isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"NoSpecialChars", "12345", "abcdefg"})
    @DisplayName("Пароль не содержит ни одного специального символа")
    void isValidPassword_noSpecialSymbol(String password) {
        assertFalse(Task4.isValidPassword(password));
    }
}


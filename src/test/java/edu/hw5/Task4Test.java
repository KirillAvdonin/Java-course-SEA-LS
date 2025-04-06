package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    @DisplayName("Пароль содержит хотя бы один специальный символ")
    void isValidPassword_containsSpecialSymbol() {
        assertTrue(Task4.isValidPassword("Secure~Password"));
        assertTrue(Task4.isValidPassword("Another!One"));
        assertTrue(Task4.isValidPassword("Has@Symbol"));
        assertTrue(Task4.isValidPassword("Check#"));
        assertTrue(Task4.isValidPassword("Dollar$"));
        assertTrue(Task4.isValidPassword("Percent%"));
        assertTrue(Task4.isValidPassword("Caret^"));
        assertTrue(Task4.isValidPassword("Ampersand&"));
        assertTrue(Task4.isValidPassword("Asterisk*"));
        assertTrue(Task4.isValidPassword("Vertical|Bar"));
    }

    @Test
    @DisplayName("Пароль не содержит ни одного специального символа")
    void isValidPassword_noSpecialSymbol() {
        assertFalse(Task4.isValidPassword("NoSpecialChars"));
        assertFalse(Task4.isValidPassword("12345"));
        assertFalse(Task4.isValidPassword("abcdefg"));
        assertFalse(Task4.isValidPassword(""));
        assertFalse(Task4.isValidPassword(" "));
    }

    @Test
    @DisplayName("Пароль содержит несколько специальных символов")
    void isValidPassword_multipleSpecialSymbols() {
        assertTrue(Task4.isValidPassword("Pass~word@!"));
        assertTrue(Task4.isValidPassword("#$%^&*|"));
    }

    @Test
    @DisplayName("Пароль содержит специальный символ в начале")
    void isValidPassword_specialSymbolAtStart() {
        assertTrue(Task4.isValidPassword("~Password"));
    }

    @Test
    @DisplayName("Пароль содержит специальный символ в конце")
    void isValidPassword_specialSymbolAtEnd() {
        assertTrue(Task4.isValidPassword("Password~"));
    }
}


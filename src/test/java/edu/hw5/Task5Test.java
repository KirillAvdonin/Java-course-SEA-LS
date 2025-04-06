package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task5Test {
    @Test
    @DisplayName("Корректный номер с двузначным регионом (не начинающимся с 0)")
    void isValidAutoNumber_validTwoDigitRegion() {
        assertTrue(Task5.isValidAutoNumber("А123ВС99"));
        assertTrue(Task5.isValidAutoNumber("В987НЕ10"));
        assertTrue(Task5.isValidAutoNumber("Е012КЕ01"));
        assertTrue(Task5.isValidAutoNumber("К555УМ25"));
        assertTrue(Task5.isValidAutoNumber("М321НО50"));
        assertTrue(Task5.isValidAutoNumber("Н789КР77"));
        assertTrue(Task5.isValidAutoNumber("О456РС90"));
        assertTrue(Task5.isValidAutoNumber("Р654СТ17"));
        assertTrue(Task5.isValidAutoNumber("С234АВ79"));
        assertTrue(Task5.isValidAutoNumber("Т876КК99"));
    }

    @Test
    @DisplayName("Корректный номер с трехзначным регионом (начинающимся с 1, 7 или 9)")
    void isValidAutoNumber_validThreeDigitRegion() {
        assertTrue(Task5.isValidAutoNumber("С234АВ177"));
        assertTrue(Task5.isValidAutoNumber("Р654СТ750"));
        assertTrue(Task5.isValidAutoNumber("К555УМ999"));
        assertTrue(Task5.isValidAutoNumber("К555УМ123"));
        assertTrue(Task5.isValidAutoNumber("М321НО777"));
        assertTrue(Task5.isValidAutoNumber("Н789АА900"));
    }

    @Test
    @DisplayName("Некорректный номер: неверный первый символ")
    void isValidAutoNumber_invalidFirstChar() {
        assertFalse(Task5.isValidAutoNumber("X123ВГ99"));
        assertFalse(Task5.isValidAutoNumber("1123ВГ99"));
        assertFalse(Task5.isValidAutoNumber("_123ВГ99"));
    }

    @Test
    @DisplayName("Некорректный номер: неверные цифры (00 или начинаются с 0)")
    void isValidAutoNumber_invalidDigits() {
        assertFalse(Task5.isValidAutoNumber("А003ВГ99"));
        assertFalse(Task5.isValidAutoNumber("А013ВГ99"));
        assertFalse(Task5.isValidAutoNumber("А093ВГ99"));
    }

    @Test
    @DisplayName("Некорректный номер: неверные средние символы")
    void isValidAutoNumber_invalidMiddleChars() {
        assertFalse(Task5.isValidAutoNumber("А123ХГ99"));
        assertFalse(Task5.isValidAutoNumber("А123В199"));
        assertFalse(Task5.isValidAutoNumber("А123ВГZ9"));
    }

    @Test
    @DisplayName("Некорректный номер: неверный формат региона (начинается с 0, кроме 01)")
    void isValidAutoNumber_invalidRegionStartsWithZero() {
        assertFalse(Task5.isValidAutoNumber("А123ВГ02"));
        assertFalse(Task5.isValidAutoNumber("А123ВГ09"));
        assertFalse(Task5.isValidAutoNumber("А123ВГ00"));
    }

    @Test
    @DisplayName("Некорректный номер: неверный формат региона (трехзначный, не начинается с 1, 7 или 9)")
    void isValidAutoNumber_invalidThreeDigitRegionStart() {
        assertFalse(Task5.isValidAutoNumber("А123ВГ200"));
        assertFalse(Task5.isValidAutoNumber("А123ВГ077"));
        assertFalse(Task5.isValidAutoNumber("А123ВГ888"));
    }

    @Test
    @DisplayName("Некорректный номер: слишком короткая строка")
    void isValidAutoNumber_tooShort() {
        assertFalse(Task5.isValidAutoNumber("А12ВГ9"));
        assertFalse(Task5.isValidAutoNumber("А123ВГ"));
    }

    @Test
    @DisplayName("Некорректный номер: слишком длинная строка")
    void isValidAutoNumber_tooLong() {
        assertFalse(Task5.isValidAutoNumber("А123ВВ9999"));
        assertFalse(Task5.isValidAutoNumber("А123ВС1777"));
    }

    @Test
    @DisplayName("Некорректный номер: регион из одной цифры")
    void isValidAutoNumber_singleDigitRegion() {
        assertFalse(Task5.isValidAutoNumber("А123ВС9"));
    }
}

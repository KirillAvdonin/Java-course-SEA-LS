package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @ParameterizedTest
    @ValueSource(strings = {"А123ВС99", "В987НЕ10", "Е012КЕ01",
            "К555УМ25", "М321НО50", "Н789КР77", "О456РС90", "Р654СТ17",
            "С234АВ79", "Т876КК99", "С234АВ177", "Р654СТ750", "К555УМ999",
            "К555УМ123", "М321НО777", "Н789АА900"})
    @DisplayName("Корректные номера (двух- и трехзначные регионы)")
    void isValidAutoNumber_validFormats(String number) {
        assertTrue(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"X123ВГ99", "1123ВГ99", "_123ВГ99"})
    @DisplayName("Некорректный номер: неверный первый символ")
    void isValidAutoNumber_invalidFirstChar(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А003ВГ99", "А013ВГ99", "А093ВГ99"})
    @DisplayName("Некорректный номер: неверные цифры (начинаются с 0)")
    void isValidAutoNumber_invalidDigitsStartWithZero(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А123ХГ99", "А123В199", "А123ВГZ9"})
    @DisplayName("Некорректный номер: неверные средние символы")
    void isValidAutoNumber_invalidMiddleChars(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А123ВГ02", "А123ВГ09", "А123ВГ00"})
    @DisplayName("Некорректный номер: неверный формат региона (начинается с 0, кроме 01)")
    void isValidAutoNumber_invalidRegionStartsWithZero(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А123ВГ200", "А123ВГ077", "А123ВГ888"})
    @DisplayName("Некорректный номер: неверный формат региона (трехзначный, не начинается с 1, 7 или 9)")
    void isValidAutoNumber_invalidThreeDigitRegionStart(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А12ВГ9", "А123ВГ"})
    @DisplayName("Некорректный номер: слишком короткая строка")
    void isValidAutoNumber_tooShort(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А123ВВ9999", "А123ВС1777"})
    @DisplayName("Некорректный номер: слишком длинная строка")
    void isValidAutoNumber_tooLong(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"А123ВС9"})
    @DisplayName("Некорректный номер: регион из одной цифры")
    void isValidAutoNumber_singleDigitRegion(String number) {
        assertFalse(Task5.isValidAutoNumber(number));
    }
}

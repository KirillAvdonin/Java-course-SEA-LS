package edu.hw5.Task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static edu.hw5.Task2.SearchNextFridayThirteenByDate.findNextFridayThirteenth;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2ForNextFridayThirteenByDateTest {
    @Test
    @DisplayName("Поиск следующей пятницы 13-го после 01.01.2023")
    void findNextFridayThirteenth_after_2023_01_01() {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate expected = LocalDate.of(2023, 1, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го после 13.01.2023")
    void findNextFridayThirteenth_after_2023_01_13() {
        LocalDate startDate = LocalDate.of(2023, 1, 13);
        LocalDate expected = LocalDate.of(2023, 10, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го после 14.01.2023")
    void findNextFridayThirteenth_after_2023_01_14() {
        LocalDate startDate = LocalDate.of(2023, 1, 14);
        LocalDate expected = LocalDate.of(2023, 10, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го после последней пятницы 13-го в году")
    void findNextFridayThirteenth_after_last_in_year() {
        LocalDate startDate = LocalDate.of(2023, 10, 14);
        LocalDate expected = LocalDate.of(2024, 9, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го, если текущая дата - пятница 13-е")
    void findNextFridayThirteenth_on_friday_13th() {
        LocalDate startDate = LocalDate.of(2023, 1, 13);
        LocalDate expected = LocalDate.of(2023, 10, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го в високосном году")
    void findNextFridayThirteenth_leap_year() {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate expected = LocalDate.of(2024, 9, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го в конце месяца")
    void findNextFridayThirteenth_end_of_month() {
        LocalDate startDate = LocalDate.of(2023, 9, 30);
        LocalDate expected = LocalDate.of(2023, 10, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го в конце года")
    void findNextFridayThirteenth_end_of_year() {
        LocalDate startDate = LocalDate.of(2023, 12, 31);
        LocalDate expected = LocalDate.of(2024, 9, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }

    @Test
    @DisplayName("Поиск следующей пятницы 13-го после даты в будущем")
    void findNextFridayThirteenth_future_date() {
        LocalDate startDate = LocalDate.of(2026, 1, 1);
        LocalDate expected = LocalDate.of(2026, 2, 13);
        assertEquals(expected, findNextFridayThirteenth(startDate));
    }
}

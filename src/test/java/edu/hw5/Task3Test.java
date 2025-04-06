package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Optional;
import edu.hw5.Task3.ChainOfParsers;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task3Test {
    @Test
    @DisplayName("Парсинг даты в формате yyyy-MM-dd")
    void parseDate_yyyy_MM_dd() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("2020-10-10");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.of(2020, 10, 10), date.get());
    }

    @Test
    @DisplayName("Парсинг даты в формате yyyy-MM-d")
    void parseDate_yyyy_MM_d() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("2020-12-2");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.of(2020, 12, 2), date.get());
    }

    @Test
    @DisplayName("Парсинг даты в формате M/d/yyyy")
    void parseDate_M_d_yyyy() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("1/3/1976");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.of(1976, 3, 1), date.get());
    }

    @Test
    @DisplayName("Парсинг даты в формате M/d/yy (21 век)")
    void parseDate_M_d_yy_21stCentury() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("1/3/20");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.of(2020, 3, 1), date.get());
    }

    @Test
    @DisplayName("Парсинг 'tomorrow'")
    void parseDate_tomorrow() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("tomorrow");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now().plusDays(1), date.get());
    }

    @Test
    @DisplayName("Парсинг 'today'")
    void parseDate_today() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("today");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now(), date.get());
    }

    @Test
    @DisplayName("Парсинг 'yesterday'")
    void parseDate_yesterday() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("yesterday");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now().minusDays(1), date.get());
    }

    @Test
    @DisplayName("Парсинг '1 day ago'")
    void parseDate_one_day_ago() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("1 day ago");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now().minusDays(1), date.get());
    }

    @Test
    @DisplayName("Парсинг '2234 days ago'")
    void parseDate_many_days_ago() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("2234 days ago");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now().minusDays(2234), date.get());
    }

    @Test
    @DisplayName("Парсинг некорректной строки")
    void parseDate_invalid_string() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("invalid date");
        assertFalse(date.isPresent());
    }

    @Test
    @DisplayName("Парсинг строки с лишними пробелами")
    void parseDate_extra_spaces() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("  2020-10-10  ");
        assertFalse(date.isPresent()); // Пробелы не обрабатываются текущей реализацией
    }

    @Test
    @DisplayName("Парсинг даты с неполными данными (только год и месяц)")
    void parseDate_incomplete_date() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("2020-10");
        assertFalse(date.isPresent());
    }

    @Test
    @DisplayName("Парсинг относительной даты с опечаткой")
    void parseDate_relative_typo() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("tomorow");
        assertFalse(date.isPresent());
    }

    @Test
    @DisplayName("Парсинг '0 days ago'")
    void parseDate_zero_days_ago() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("0 days ago");
        assertTrue(date.isPresent());
        assertEquals(LocalDate.now(), date.get());
    }

    @Test
    @DisplayName("Парсинг '-11 days ago'")
    void parseDate_uncorrected_days_ago() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("-11 days ago");
        assertFalse(date.isPresent());
    }

    @Test
    @DisplayName("Парсинг даты с некорректными разделителями")
    void parseDate_wrong_separators() {
        Optional<LocalDate> date = ChainOfParsers.parseDate("2020/10/10");
        assertFalse(date.isPresent());
    }
}

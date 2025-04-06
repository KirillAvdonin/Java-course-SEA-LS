package edu.hw5.Task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task2ForAllFridaysThirteenTest {
    @Test
    @DisplayName("Поиск пятниц 13-го в 2023 году")
    void fridays_year2023() {
        List<LocalDate> expected = List.of(
            LocalDate.of(2023, 1, 13),
            LocalDate.of(2023, 10, 13)
        );
        assertEquals(expected, SearchAllFridaysThirteen.fridays(2023));
    }

    @Test
    @DisplayName("Поиск пятниц 13-го в 2024 году (високосный)")
    void fridays_year2024() {
        List<LocalDate> expected = List.of(
            LocalDate.of(2024, 9, 13),
            LocalDate.of(2024, 12, 13)
        );
        assertEquals(expected, SearchAllFridaysThirteen.fridays(2024));
    }

    @Test
    @DisplayName("Поиск пятниц 13-го в 2025 году")
    void fridays_year2025() {
        List<LocalDate> expected = List.of(
            LocalDate.of(2025, 6, 13)
        );
        assertEquals(expected, SearchAllFridaysThirteen.fridays(2025));
    }

    @Test
    @DisplayName("Выброс исключения для отрицательного года")
    void fridays_negativeYear() {
        assertThrows(
            RuntimeException.class,
            () -> SearchAllFridaysThirteen.fridays(-1),
            "Год не может быть отрицательным"
        );
    }

}

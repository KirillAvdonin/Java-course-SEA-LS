package edu.hw5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task1Test {
    @Test
    @DisplayName("Расчет среднего времени для корректных сессий")
    void averageTimePerSession_validSessions() {
        List<String> sessions = List.of(
            "2023-10-20, 10:00 - 2023-10-20, 11:30",
            "2023-10-21, 08:00 - 2023-10-21, 10:00",
            "2023-10-22, 12:00 - 2023-10-22, 12:30"
        );
        String expected = "Среднее количество времени, проведенного в компьютерном клубе:1ч 20м";
        assertEquals(expected, Task1.averageTimePerSession(sessions));
    }

    @Test
    @DisplayName("Расчет среднего времени для одной сессии")
    void averageTimePerSession_singleSession() {
        List<String> sessions = List.of("2024-04-06, 19:00 - 2024-04-06, 20:15");
        String expected = "Среднее количество времени, проведенного в компьютерном клубе:1ч 15м";
        assertEquals(expected, Task1.averageTimePerSession(sessions));
    }

    @Test
    @DisplayName("Расчет среднего времени для сессий с разным количеством минут")
    void averageTimePerSession_differentMinutes() {
        List<String> sessions = List.of(
            "2025-01-15, 15:00 - 2025-01-15, 15:01",
            "2025-01-16, 16:00 - 2025-01-16, 16:02",
            "2025-01-17, 17:00 - 2025-01-17, 17:03"
        );
        String expected = "Среднее количество времени, проведенного в компьютерном клубе:0ч 2м";
        assertEquals(expected, Task1.averageTimePerSession(sessions));
    }

    @Test
    @DisplayName("Выброс исключения для пустого списка сессий")
    void averageTimePerSession_emptyList() {
        List<String> sessions = List.of();
        assertThrows(RuntimeException.class, () -> Task1.averageTimePerSession(sessions), "Лист пуст или равен null");
    }

    @Test
    @DisplayName("Выброс исключения для списка с некорректным форматом сессии")
    void averageTimePerSession_invalidFormat() {
        List<String> sessions = List.of("2023-10-20 10:00 - 2023-10-20 11:30");
        assertThrows(
            RuntimeException.class, () -> Task1.averageTimePerSession(sessions),
            "Некорректный ввод данных о сессии, введите в форматеyyyy-MM-dd, HH:MM -yyyy-MM-dd, HH:MM"
        );
    }

    @Test
    @DisplayName("Выброс исключения для списка с пустой сессией")
    void averageTimePerSession_emptySessionString() {
        List<String> sessions = List.of("2023-10-20, 10:00 - 2023-10-20, 11:30", "");
        assertThrows(
            RuntimeException.class,
            () -> Task1.averageTimePerSession(sessions),
            "Сессия пуста или равна null"
        );
    }

    @Test
    @DisplayName("Расчет среднего времени, если сессии длятся несколько часов")
    void averageTimePerSession_multipleHours() {
        List<String> sessions = List.of(
            "2024-03-01, 09:00 - 2024-03-01, 12:00",
            "2024-03-02, 14:00 - 2024-03-02, 17:00"
        );
        String expected = "Среднее количество времени, проведенного в компьютерном клубе:3ч 0м";
        assertEquals(expected, Task1.averageTimePerSession(sessions));
    }

    @Test
    @DisplayName("Расчет среднего времени с переходом на следующий день")
    void averageTimePerSession_nextDay() {
        List<String> sessions = List.of("2025-04-06, 20:00 - 2025-04-07, 01:00");
        String expected = "Среднее количество времени, проведенного в компьютерном клубе:5ч 0м";
        assertEquals(expected, Task1.averageTimePerSession(sessions));
    }
}


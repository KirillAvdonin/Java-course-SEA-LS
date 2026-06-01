package refresh.hw1;

import edu.refresh.hw1.VideoTimeUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VideoTimeUtilsTest {
    @Test
    @DisplayName("Валидное время")
    void validTime() {
        int testTime = VideoTimeUtils.durationToSeconds("01:30");
        assertEquals(90, testTime);
    }

    @Test
    @DisplayName("Неверно указаны секунды")
    void notValidSeconds() {
        int testTime = VideoTimeUtils.durationToSeconds("01:-30");
        assertEquals(-1, testTime);
    }

    @Test
    @DisplayName("Неверный формат")
    void notValidFormat() {
        int testTime = VideoTimeUtils.durationToSeconds("abc");
        assertEquals(-1, testTime);
    }

    @Test
    @DisplayName("Передан null в качестве аргумента для первого метода")
    void nullFormat() {
        int testTime = VideoTimeUtils.durationToSeconds("null");
        assertEquals(-1, testTime);
    }

    @Test
    @DisplayName("Передан пустая строка в качестве аргумента для первого метода")
    void emptyFormat() {
        int testTime = VideoTimeUtils.durationToSeconds("");
        assertEquals(-1, testTime);
    }

    @Test
    @DisplayName("Перестановка четной строки")
    void evenString() {
        String testString = VideoTimeUtils.fixBrokenTitle("2143");
        assertEquals("1234", testString);
    }

    @Test
    @DisplayName("Перестановка нечетной строки")
    void notEvenString() {
        String testString = VideoTimeUtils.fixBrokenTitle("213");
        assertEquals("123", testString);
    }

    @Test
    @DisplayName("Null в качестве аргумента для второго метода")
    void nullFormatString() {
        assertThrows(
            IllegalArgumentException.class, () -> {
                VideoTimeUtils.fixBrokenTitle(null);
            }
        );
    }

    @Test
    @DisplayName("Пустая строка для второго метода")
    void emptyString() {
        String testString = VideoTimeUtils.fixBrokenTitle("");
        assertEquals("", testString);
    }

    @Test
    @DisplayName("Передана строка длиной 1 буква")
    void oneSymbolString() {
        String testString = VideoTimeUtils.fixBrokenTitle("а");
        assertEquals("а", testString);
    }

    @Test
    @DisplayName("Массив inner равен null")
    void innerNull() {
        assertThrows(
            IllegalArgumentException.class, () -> {
                VideoTimeUtils.isSortedNested(null, new int[] {1, 2, 3, 4});
            }
        );
    }

    @Test
    @DisplayName("Массив outer равен null")
    void outerNull() {
        assertThrows(
            IllegalArgumentException.class, () -> {
                VideoTimeUtils.isSortedNested(new int[] {1, 2, 3, 4}, null);
            }
        );
    }

    @Test
    @DisplayName("Массив inner пуст")
    void innerEmptyArray() {
        assertThrows(
            IllegalArgumentException.class, () -> {
                VideoTimeUtils.isSortedNested(new int[] {}, new int[] {1, 2, 3, 4});
            }
        );
    }

    @Test
    @DisplayName("Массив outer пуст")
    void outerEmptyArray() {
        assertThrows(
            IllegalArgumentException.class, () -> {
                VideoTimeUtils.isSortedNested(new int[] {1, 2, 3, 4}, new int[] {});
            }
        );
    }

    @Test
    @DisplayName("Массив outer пуст")
    void nestedArray() {
        assertTrue(VideoTimeUtils.isSortedNested(new int[] {2, 3, 4}, new int[] {1, 5}));
    }

    @Test
    @DisplayName("Массив outer пуст")
    void notNestedArray() {
        assertFalse(VideoTimeUtils.isSortedNested(new int[] {2, 6}, new int[] {1, 5}));
    }
}


package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static edu.hw3.FrequencyDictionary.freqDict;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyDictionaryTest {
    @Test
    void frequencyDictionaryTest() {
        HashMap<String, Integer> test1 = new HashMap<>();
        test1.put("Лада", 2);
        test1.put("Феррари", 1);

        HashMap<Character, Integer> test2 = new HashMap<>();
        test2.put('c', 2);
        test2.put('a', 1);

        HashMap<Integer, Integer> test3 = new HashMap<>();
        test3.put(1, 2);
        test3.put(2, 3);
        List<String> testList = new ArrayList<>();
        testList.add(null);
        testList.add(null);
        testList.add(null);

        assertEquals(
            test1,
            freqDict(List.of("Лада", "Лада", "Феррари"))
        );

        assertEquals(
            test2,
            freqDict(List.of('c', 'c', 'a'))
        );

        assertEquals(
            test3,
            freqDict(List.of(1, 1, 2, 2, 2))
        );

        assertThatThrownBy(() -> freqDict(testList)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Лист не должен содержать null");

        assertThatThrownBy(() -> freqDict(List.of())).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("Лист не должен быть пустым");

        assertThatThrownBy(() -> freqDict(List.of("","",""))).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("Элемент листа не должен быть пустым");
    }
}

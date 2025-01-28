package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FrequencyDictionaryTest {
    @Test
    void frequencyDictionaryTest() {
        assertEquals(
            "{\"Лада\" : 1, \"Феррари\" : 3}",
            new FrequencyDictionary().freqDict(List.of("Лада", "Феррари", "Феррари", "Феррари"))
        );

        assertEquals(
            "{\"Java\" : 1, \"Set\" : 1, \"Tree\" : 2}",
            new FrequencyDictionary().freqDict(List.of("Tree", "Java", "Tree", "Set"))
        );

        assertEquals(
            "{1 : 1, 2 : 3}",
            new FrequencyDictionary().freqDict(List.of(1, 2, 2, 2))
        );

    }
}

package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseItertatorTest<T> {
    @Test
    void ReverseIteratorTest() {
        ReverseIterator<Integer> reverseIteratorTest1 = new ReverseIterator<>(List.of(1, 2, 3, 4, 5));
        ReverseIterator<String> reverseIteratorTest2 = new ReverseIterator<>(List.of("Fruit", "Vegetable", "Collage"));
        List<Object> testResult1 = new ArrayList<>();
        List<Object> testResult2 = new ArrayList<>();

        while (reverseIteratorTest1.hasNext()) {
            testResult1.add(reverseIteratorTest1.next());
        }

        while (reverseIteratorTest2.hasNext()) {
            testResult2.add(reverseIteratorTest2.next());
        }

        assertEquals(List.of(5, 4, 3, 2, 1), testResult1);

        assertEquals(List.of("Collage", "Vegetable", "Fruit"), testResult2);
    }
}

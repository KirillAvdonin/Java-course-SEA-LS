package edu.hw3;

import org.junit.jupiter.api.Test;
import static edu.hw3.ClusteringBrackets.isCorrectlyInput;
import static org.junit.jupiter.api.Assertions.*;
import static edu.hw3.ClusteringBrackets.clusterize;

class ClusteringBracketsTest {

    @Test
    void clusterizeTest() {
        assertEquals("[" + "\"()\"" + ", " + "\"()\"" + ", " + "\"()\"" + "]", clusterize("()()()"));

        assertEquals("[" + "\"((()))\"" + "]", clusterize("((()))"));

        assertEquals(
            "[" + "\"((()))\"" + ", " + "\"(())\"" + ", " + "\"()\"" + ", " + "\"()\"" + ", " + "\"(()())\"" + "]",
            clusterize("((()))(())()()(()())")
        );
        assertEquals("[" + "\"((())())\"" + ", " + "\"(()(()()))\"" + "]", clusterize("((())())(()(()()))"));

        IllegalArgumentException thrown1 = assertThrows(
            IllegalArgumentException.class,
            () -> clusterize("(((((((((((((((((((("),
            "Некорректный ввод скобок для кластеризации"
        );
        assertEquals("Некорректный ввод скобок для кластеризации", thrown1.getMessage());

        IllegalArgumentException thrown2 = assertThrows(
            IllegalArgumentException.class,
            () -> clusterize("{{{{{{}}}}}}"),
            "Некорректный ввод скобок для кластеризации"
        );
        assertEquals("Некорректный ввод скобок для кластеризации", thrown2.getMessage());
    }

    @Test
    void isCorrectlyInputTest() {
        assertTrue(isCorrectlyInput("()()()()"));
        assertTrue(isCorrectlyInput("(((())))"));

        assertFalse(isCorrectlyInput("(()"));
        assertFalse(isCorrectlyInput("(({}))"));
        assertFalse(isCorrectlyInput("(a(a)0932"));
        assertFalse(isCorrectlyInput("())"));
    }
}

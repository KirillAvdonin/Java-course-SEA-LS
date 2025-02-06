package edu.hw3;

import org.junit.jupiter.api.Test;
import java.util.List;
import static edu.hw3.ClusteringBrackets.isCorrectlyInput;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static edu.hw3.ClusteringBrackets.clusterize;

class ClusteringBracketsTest {

    @Test
    void clusterizeTest() {
        assertEquals(List.of("()", "()", "()"), clusterize("()()()"));

        assertEquals(List.of("((()))"), clusterize("((()))"));

        assertEquals(
            List.of("((()))", "(())", "()", "()", "(()())"),
            clusterize("((()))(())()()(()())")
        );

        assertEquals(List.of("((())())", "(()(()()))"), clusterize("((())())(()(()()))"));

        assertThatThrownBy(() -> clusterize(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Строка не должна быть null");

        assertThatThrownBy(() -> clusterize("((((((((((")).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("Некорректный ввод скобок для кластеризации");

        assertThatThrownBy(() -> clusterize("")).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("Строка не должна быть пустой");
    }

    @Test
    void isCorrectlyInputTest() {
        assertTrue(isCorrectlyInput("()()()()"));
        assertTrue(isCorrectlyInput("(((())))"));
        assertTrue(isCorrectlyInput("(({}))"));

        assertFalse(isCorrectlyInput("(()"));
        assertFalse(isCorrectlyInput("(a()"));
        assertFalse(isCorrectlyInput("{09())"));
    }
}

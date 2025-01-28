package edu.hw3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeAndNullTest {
    @Test
    void treeAndNullTest() {
        TreeAndNull treeAndNull = new TreeAndNull();
        treeAndNull.add("Тест1", "тест");
        treeAndNull.add("Тест2", "тест");
        treeAndNull.add(null, "тест");
        treeAndNull.add("Тест4", "тест");
        treeAndNull.add("Тест5", null);

        Assertions.assertTrue(treeAndNull.getNullTreeMap().containsKey(null));
    }
}

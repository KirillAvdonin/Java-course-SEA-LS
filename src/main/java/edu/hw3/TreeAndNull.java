package edu.hw3;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeAndNull {
    private final TreeMap<String, String> nullTreeMap = new TreeMap<>(Comparator.nullsLast(Comparator.naturalOrder()));

    public void add(String key, String value) {
        nullTreeMap.put(key, value);
    }

    public TreeMap<String, String> getNullTreeMap() {
        return nullTreeMap;
    }

}

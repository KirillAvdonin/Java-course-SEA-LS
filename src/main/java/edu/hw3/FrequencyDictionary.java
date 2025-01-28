package edu.hw3;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class FrequencyDictionary {

    public FrequencyDictionary() {

    }

    public <T> String freqDict(List<T> dictionary) {
        TreeSet<T> dictionarySet = new TreeSet<>(dictionary);
        StringBuilder result = new StringBuilder().append("{");

        for (T word : dictionarySet) {
            if (word instanceof String) {
                result.append("\"").append(word).append("\" : ")
                    .append(Collections.frequency(dictionary, word));
            } else {
                result.append(word).append(" : ").append(Collections.frequency(dictionary, word));
            }
            if (dictionarySet.last().equals(word)) {
                result.append("}");
            } else {
                result.append(", ");
            }
        }

        return String.valueOf(result);
    }
}


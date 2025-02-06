package edu.hw3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class FrequencyDictionary {

    private FrequencyDictionary() {

    }

    public static <T> HashMap<T, Integer> freqDict(List<T> dictionary) {
        try {
            if (!dictionary.isEmpty()) {
                TreeSet<T> dictionarySet = new TreeSet<>(dictionary);
                HashMap<T, Integer> result = new HashMap<>();

                for (T word : dictionarySet) {
                    if (!word.equals("")) {
                        result.put(word, Collections.frequency(dictionary, word));
                    } else {
                        throw new IllegalArgumentException("Элемент листа не должен быть пустым");
                    }
                }
                return result;
            } else {
                throw new IllegalArgumentException("Лист не должен быть пустым");
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Лист не должен содержать null");
        }
    }
}


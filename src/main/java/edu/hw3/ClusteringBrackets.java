package edu.hw3;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ClusteringBrackets {

    private static int countOpenBrackets = 0;
    private static int countCloseBrackets = 0;

    private ClusteringBrackets() {

    }

    public static List<String> clusterize(String brackets) {
        ArrayList<String> clusterizedBrackets = new ArrayList<>();

        if (isCorrectlyInput(brackets)) {
            char[] bracketsChar = brackets.toCharArray();
            StringBuilder partOfExpression = new StringBuilder();

            for (char c : bracketsChar) {
                if (c == '{' || c == '[' || c == '(') {
                    countOpenBrackets++;
                    partOfExpression.append(c);

                } else {
                    countCloseBrackets++;
                    partOfExpression.append(c);
                }

                if (countCloseBrackets == countOpenBrackets) {
                    clusterizedBrackets.add(partOfExpression.toString());
                    partOfExpression.delete(0, partOfExpression.length());
                }
            }
        } else {
            throw new IllegalArgumentException("Некорректный ввод скобок для кластеризации");
        }

        return clusterizedBrackets;
    }

    public static boolean isCorrectlyInput(String expression) {

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(']', '[');
        brackets.put(')', '(');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();

        try {
            if (expression.isEmpty()) {
                throw new IllegalArgumentException("Строка не должна быть пустой");
            } else {
                for (Character c : expression.toCharArray()) {
                    if (brackets.containsValue(c)) {
                        stack.push(c);
                    } else if (brackets.containsKey(c)) {
                        if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                            return false;
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Строка не должна быть null");
        }
        return stack.isEmpty();
    }
}


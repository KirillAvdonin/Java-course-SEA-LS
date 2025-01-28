package edu.hw3;

import java.util.ArrayList;

public class ClusteringBrackets {

    private ClusteringBrackets() {

    }

    public static String clusterize(String brackets) {
        char[] bracketsChar = brackets.toCharArray();
        ArrayList<String> clusterizedBrackets = new ArrayList<>();
        int countOpenBrackets = 0;
        int countCloseBrackets = 0;
        StringBuilder partOfClustering = new StringBuilder();

        if (isCorrectlyInput(brackets)) {
            for (char c : bracketsChar) {

                if (c == '(') {
                    countOpenBrackets++;
                    partOfClustering.append(c);
                } else {
                    countCloseBrackets++;
                    partOfClustering.append(c);
                }

                if (countCloseBrackets == countOpenBrackets) {
                    clusterizedBrackets.add("\"" + partOfClustering + "\"");
                    partOfClustering.delete(0, partOfClustering.length());
                }
            }
        } else {
            throw new IllegalArgumentException("Некорректный ввод скобок для кластеризации");
        }
        return String.valueOf(clusterizedBrackets);
    }

    public static boolean isCorrectlyInput(String expression) {
        if (!expression.matches("[^{}\\]\\[]+")) {
            return false;
        } else if ((expression.indexOf('(') == -1 || expression.indexOf(')') == -1)) {
            return false;
        } else return expression.length() % 2 == 0;
    }
}

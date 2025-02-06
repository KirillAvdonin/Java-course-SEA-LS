package edu.hw3;

public class Atbash {

    private Atbash() {

    }

    public static String atbash(String expression) throws IllegalArgumentException {

        try {
            if (!expression.isEmpty()) {

                char[] expressionCharArray = expression.toCharArray();
                char charExpression;

                for (int i = 0; i < expressionCharArray.length; i++) {
                    charExpression = expressionCharArray[i];

                    if (charExpression >= 'a' && charExpression <= 'z') {
                        expressionCharArray[i] = (char) ('z' + 'a' - charExpression);
                    } else if (charExpression >= 'A' && charExpression <= 'Z') {
                        expressionCharArray[i] = (char) ('Z' + 'A' - charExpression);
                    }
                }
                return String.valueOf(expressionCharArray);
            } else {
                throw new IllegalArgumentException("Строка не должна быть пустой");
            }
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Строка не должна быть null");
        }
    }
}

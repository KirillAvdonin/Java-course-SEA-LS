package edu.hw3;

public class Atbash {

    private Atbash() {

    }

    public static String atbash(String expression) {
        char[] charExpression = expression.toCharArray();

        for (int i = 0; i < charExpression.length; i++) {

            if (Character.isLetter(charExpression[i])) {

                if (Character.isLowerCase(charExpression[i])) {
                    charExpression[i] = (char) ('z' + 'a' - charExpression[i]);
                } else {
                    charExpression[i] = (char) ('Z' + 'A' - charExpression[i]);
                }
            }
        }
        return String.valueOf(charExpression);
    }
}

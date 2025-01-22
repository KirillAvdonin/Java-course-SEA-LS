package edu.hw1;

public class Task4 {

    private Task4() {
    }

    public static String fixString(String str) {
        char[] stringArray = str.toCharArray();
        char temp;

        for (int i = 1; i < stringArray.length; i += 2) {
            temp = stringArray[i];
            stringArray[i] = stringArray[i - 1];
            stringArray[i - 1] = temp;
        }

        return String.valueOf(stringArray);
    }
}

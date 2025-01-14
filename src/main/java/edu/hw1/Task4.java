package edu.hw1;

public class Task4 {

    private Task4() {
    }

    public static String fixString(String str) {
        char[] stringArray = str.toCharArray();
        for (int i = 0; i < stringArray.length; i++) {
            if (i % 2 != 0) {
                char temp = 0;
                temp = stringArray[i - 1];
                stringArray[i - 1] = stringArray[i];
                stringArray[i] = temp;
            }

        }
        return String.valueOf(stringArray);
    }
}

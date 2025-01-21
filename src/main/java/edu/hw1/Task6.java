package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {

    }

    public static final int KAPREKARS_CONSTANT = 6174;

    public static int countK(int number) {
        int countK = 0;
        int newNumber = number;
        while (newNumber != KAPREKARS_CONSTANT) {
            int up = sortedUp(number);
            int down = sortedDown(number);

            newNumber = down - up;
            countK++;
        }
        return countK;
    }

    private static int sortedUp(int number) {
        String numStr = String.valueOf(number);
        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);
        String sortedStr = new String(digits);
        return Integer.parseInt(sortedStr);
    }

    private static int sortedDown(int number) {
        String numStr = String.valueOf(number);
        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);
        reverse(digits);
        String sortedStr = new String(digits);
        return Integer.parseInt(sortedStr);
    }

    private static void reverse(char[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}



package edu.hw1;

import java.util.Arrays;

public class Task6 {
    private Task6() {

    }

    public static final int kaprekarsConstant = 6174;

    public static int countK(int number) {
        int newNumber = number;
        Task6 kap = new Task6();
        int countK = 0;
        while (newNumber != kaprekarsConstant) {
            int up = kap.sortedUp(newNumber);
            int down = kap.sortedDown(newNumber);

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



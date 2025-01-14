package edu.hw1;

public class Task3 {
    private Task3() {

    }

    public static boolean isNested(int[] a, int[] b) {
        int[] firstArray = a;
        int[] secondArray = b;
        int minFirstArray = a[0];
        int minSecondArray = b[0];
        int maxFirstArray = 0;
        int maxSecondArray = 0;
        boolean isNested = false;

        for (int num : firstArray) {
            if (num < minFirstArray) {
                minFirstArray = num;
            }
        }

        for (int num : secondArray) {
            if (num < minSecondArray) {
                minSecondArray = num;
            }
        }

        for (int num : firstArray) {
            if (num > maxFirstArray) {
                maxFirstArray = num;
            }
        }

        for (int num : secondArray) {
            if (num > maxSecondArray) {
                maxSecondArray = num;
            }
        }

        if (minFirstArray > minSecondArray || maxFirstArray < maxSecondArray) {
            isNested = true;
        }
        return isNested;
    }
}

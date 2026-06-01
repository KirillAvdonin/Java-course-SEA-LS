package edu.hw1;

import java.util.Arrays;

public class Task3 {
    private Task3() {

    }

    public static boolean isNested(int[] firstArray, int[] secondArray) {

        if (firstArray == null || secondArray == null || firstArray.length == 0 || secondArray.length == 0) {
            throw new RuntimeException("Один из массивов равен null или пуст");
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int minFirstArray = firstArray[0];
        int minSecondArray = secondArray[0];
        int maxFirstArray = firstArray[firstArray.length - 1];
        int maxSecondArray = secondArray[secondArray.length - 1];

        return minFirstArray > minSecondArray || maxFirstArray < maxSecondArray;
    }
}

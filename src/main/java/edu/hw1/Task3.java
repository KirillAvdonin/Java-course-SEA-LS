package edu.hw1;

import java.util.Arrays;

public class Task3 {
    private Task3() {

    }

    public static boolean isNested(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int minFirstArray = a[0];
        int minSecondArray = b[0];
        int maxFirstArray = a[a.length - 1];
        int maxSecondArray = b[b.length - 1];

        return minFirstArray > minSecondArray || maxFirstArray < maxSecondArray;
    }
}

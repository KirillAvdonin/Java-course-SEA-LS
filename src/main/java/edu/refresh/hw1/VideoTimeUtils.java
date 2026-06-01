package edu.refresh.hw1;

import java.util.Arrays;

public final class VideoTimeUtils {
    private VideoTimeUtils() {
    }

    private static final int SECONDS_IN_MINUTE = 60;

    public static int durationToSeconds(String duration) {
        if (duration == null) {
            return -1;
        }

        if (duration.isEmpty() || !duration.matches("(0\\d|1\\d|2[0-3]):[0-5]\\d")) {
            return -1;
        }

        String[] durationArray = duration.split(":");

        return Integer.parseInt(durationArray[0]) * SECONDS_IN_MINUTE + Integer.parseInt(durationArray[1]);
    }

    public static String fixBrokenTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException();
        }

        if (title.length() == 1 || title.isEmpty()) {
            return title;
        }

        char[] titleArray = title.toCharArray();

        for (int i = 0; i < title.length(); i++) {
            char temp;
            if (i % 2 == 1) {
                temp = titleArray[i - 1];
                titleArray[i - 1] = titleArray[i];
                titleArray[i] = temp;
            }
        }
        return String.valueOf(titleArray);
    }

    public static boolean isSortedNested(int[] inner, int[] outer) {
        if (inner == null || outer == null || inner.length == 0 || outer.length == 0) {
            throw new IllegalArgumentException();
        }

        Arrays.sort(inner);
        Arrays.sort(outer);

       return inner[inner.length - 1] < outer[outer.length - 1] && inner[0] > outer[0];
    }
}



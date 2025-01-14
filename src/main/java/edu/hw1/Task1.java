package edu.hw1;

public class Task1 {
    public static final int SECONDSINMINUTE = 60;

    private Task1() {
    }

    public static int minutesToSeconds(String timeString) {
        int minutes;
        int seconds;

        String[] parts = timeString.split(":");

        if (parts.length != 2) {
            return -1;
        }

        try {
            minutes = Integer.parseInt(parts[0]);
            seconds = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (minutes < 0 || seconds < 0 || seconds >= SECONDSINMINUTE) {
            return -1;
        }

        return minutes * SECONDSINMINUTE + seconds;
    }
}


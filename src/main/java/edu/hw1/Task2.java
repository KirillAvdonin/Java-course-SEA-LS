package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static final int DISCHARGE_OFFSET = 10;

    public static int countDigits(int number) {
        int numbersCount = 0;

        do {
            numbersCount++;
            number /= DISCHARGE_OFFSET;
        } while (number != 0);

        return numbersCount;
    }
}

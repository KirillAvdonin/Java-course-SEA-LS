package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static final int DISCHARGE_OFFSET = 10;

    public static int countDigits(int number) {
        int numbersCount = 0;
        int newNumber = number;

        do {
            numbersCount++;
            newNumber /= DISCHARGE_OFFSET;
        } while (newNumber != 0);

        return numbersCount;
    }
}

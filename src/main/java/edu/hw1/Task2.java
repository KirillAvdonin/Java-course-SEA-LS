package edu.hw1;

public class Task2 {
    private Task2() {
    }

    public static final int DISCHARGEOFFSET = 10;

    public static int countDigits(int number) {
        int newNumber = number;
        int numbersCount = 0;

        do {
            numbersCount++;
            newNumber /= DISCHARGEOFFSET;
        } while (newNumber != 0);

        return numbersCount;
    }
}

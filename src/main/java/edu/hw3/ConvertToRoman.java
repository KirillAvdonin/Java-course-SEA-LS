package edu.hw3;

import java.util.TreeMap;

public class ConvertToRoman {

    private static final int ONE = 1;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int FORTY = 40;
    private static final int FIFTY = 50;
    private static final int NINETY = 90;
    private static final int ONE_HUNDRED = 100;
    private static final int FOUR_HUNDRED = 400;
    private static final int FIVE_HUNDRED = 500;
    private static final int NINE_HUNDRED = 900;
    private static final int ONE_THOUSAND = 1000;

    public ConvertToRoman() {

    }

    public StringBuilder result = new StringBuilder();

    public static final TreeMap<Integer, String> NUMBERS_UP_TO_ONE_THOUSAND = numbersUpToOneThousand();

    public String convertToRoman(int number) {
        int currentNumber = number;

        while (currentNumber != 0) {
            int nearestKey = NUMBERS_UP_TO_ONE_THOUSAND.floorKey(currentNumber);

            result.append(NUMBERS_UP_TO_ONE_THOUSAND.get(nearestKey));
            currentNumber -= nearestKey;
        }
        return String.valueOf(result);
    }

    private static TreeMap<Integer, String> numbersUpToOneThousand() {
        TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(ONE, "I");
        numbers.put(FOUR, "IV");
        numbers.put(FIVE, "V");
        numbers.put(NINE, "IX");
        numbers.put(TEN, "X");
        numbers.put(FORTY, "XL");
        numbers.put(FIFTY, "L");
        numbers.put(NINETY, "XC");
        numbers.put(ONE_HUNDRED, "C");
        numbers.put(FOUR_HUNDRED, "LD");
        numbers.put(FIVE_HUNDRED, "D");
        numbers.put(NINE_HUNDRED, "CM");
        numbers.put(ONE_THOUSAND, "M");

        return numbers;
    }
}

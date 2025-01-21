package edu.hw1;

public class Task5 {
    private Task5() {

    }

    public static boolean isPalindrome(int number) {

        Integer newNumber = number;
        String str = Integer.toString(newNumber);

        boolean isPalindrome = false;

        while (str.length() >= 2 && !isPalindrome) {
            int left = 0;
            int right = str.length() - 1;

            if (str.charAt(left) != str.charAt(right)) {
                newNumber = getNextGeneration(newNumber);
                str = String.valueOf(newNumber);
            } else {
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }

    private static int getNextGeneration(int newNumber) {
        String str = String.valueOf(newNumber);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i += 2) {
            int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
            sb.append(sum);
        }
        return Integer.parseInt(sb.toString());
    }

}

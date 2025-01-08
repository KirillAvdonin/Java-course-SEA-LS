package edu.hw1;

public class Task7 {
    private Task7() {

    }

    public static int rotateLeft(int n, int shift) {
        boolean direction = true;
        return rotate(n, shift, direction);
    }

    public static int rotateRight(int n, int shift) {
        boolean direction = false;
        return rotate(n, shift, direction);
    }

    private static int rotate(int n, int shift, boolean direction) {
        StringBuilder stringBuilder = new StringBuilder().append(Integer.toBinaryString(n));
        int currentShift = shift % stringBuilder.length();
        int curreuntNumber = 0;
        if (direction) {
            String sb1 = stringBuilder.substring(0, currentShift);
            String sb2 = stringBuilder.substring(currentShift, stringBuilder.length());
            StringBuilder result = new StringBuilder().append(sb2).append(sb1);
            result.toString();
            curreuntNumber = Integer.parseInt(String.valueOf(result), 2);
        } else {
            String sb1 = stringBuilder.substring(stringBuilder.length() - currentShift, stringBuilder.length());
            String sb2 = stringBuilder.substring(0, stringBuilder.length() - currentShift);
            StringBuilder result = new StringBuilder().append(sb1).append(sb2);
            result.toString();
            curreuntNumber = Integer.parseInt(String.valueOf(result), 2);
        }
        return curreuntNumber;
    }
}



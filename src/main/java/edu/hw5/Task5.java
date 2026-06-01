package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    private Task5() {

    }

    public static boolean isValidAutoNumber(String number) {
        if (number == null || number.isEmpty()) {
            throw new RuntimeException("Входная строка пуста или равна null");
        }

        Pattern pattern =
                Pattern.compile("(^[АВЕКМНОРСТУХ]\\d{3}[АВЕКМНОРСТУХ]{2}\\d{2,3}$)");
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }
}

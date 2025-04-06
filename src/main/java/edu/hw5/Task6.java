package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    private Task6() {

    }

    public static boolean isSecondStringContainsFirst(String firstString, String secondString) {
        Pattern pattern = Pattern.compile(".*" + firstString + ".*");
        Matcher matcher = pattern.matcher(secondString);
        return matcher.matches();
    }

}

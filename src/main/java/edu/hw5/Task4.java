package edu.hw5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    private Task4() {

    }

    public static boolean isValidPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new RuntimeException("Входная строка пуста или равна null");
        }

        Pattern pattern = Pattern.compile("[~!@#$%^&*|]");
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }
}

package edu.hw5.Task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllTasksForSevenTask {
    private AllTasksForSevenTask() {

    }

    public static boolean task1(String input) {
        Pattern pattern = Pattern.compile("^[01]{2}0[01]*$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task2(String input) {
        Pattern pattern = Pattern.compile("^0[01]*0$|^1[01]*1");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task3(String input) {
        Pattern pattern = Pattern.compile("[01]{1,3}");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}

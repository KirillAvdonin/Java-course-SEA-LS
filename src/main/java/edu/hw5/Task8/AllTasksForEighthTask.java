package edu.hw5.Task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllTasksForEighthTask {
    private AllTasksForEighthTask() {

    }

    public static boolean task1(String input) {
        Pattern pattern = Pattern.compile("^(00|01|10|11)*$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task2(String input) {
        Pattern pattern = Pattern.compile("^(0(00|01|10|11)*|1(00|01|10|11)*[01])$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task3(String input) {
        Pattern pattern = Pattern.compile("^1*(01*01*01*)*1*$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task4(String input) {
        Pattern pattern = Pattern.compile("^$|^0[01]*$|^10[01]*$|^110[01]*$|^1{4,}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task5(String input) {
        Pattern pattern = Pattern.compile("^1([01]{2})*$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task6(String input) {
        Pattern pattern = Pattern.compile("^(0{2,}1?0*|0*1?0{2,})$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean task7(String input) {
        Pattern pattern = Pattern.compile("^0*(10+)*1?$|^1?(0+1)*0*$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

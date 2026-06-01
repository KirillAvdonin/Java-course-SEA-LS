package edu.hw5.Task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SearchAllFridaysThirteen {
    private SearchAllFridaysThirteen() {

    }

    private static final int FIRST_MONTH = 1;
    private static final int LAST_MONTH = 12;
    private static final int THIRTEEN = 13;

    public static List<LocalDate> fridays(int year) {
        if (year <= 0) {
            throw new RuntimeException("Год не может быть отрицательным");
        }

        List<LocalDate> fridayThirteenths = new ArrayList<>();

        for (int month = FIRST_MONTH; month <= LAST_MONTH; month++) {
            LocalDate thirteenth = LocalDate.of(year, month, THIRTEEN);

            if (thirteenth.getDayOfWeek() == DayOfWeek.FRIDAY) {
                fridayThirteenths.add(thirteenth);
            }
        }
        return fridayThirteenths;
    }

}

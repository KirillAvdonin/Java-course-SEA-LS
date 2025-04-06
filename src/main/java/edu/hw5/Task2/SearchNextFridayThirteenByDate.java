package edu.hw5.Task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;

public class SearchNextFridayThirteenByDate {
    private SearchNextFridayThirteenByDate() {

    }

    private static final int OFFSET = 1;
    private static final int THIRTEEN = 13;

    public static LocalDate findNextFridayThirteenth(LocalDate startDate) {
        TemporalAdjuster nextFriday13th = temporal -> {
            LocalDate date = LocalDate.from(temporal);
            while (true) {
                date = date.plusDays(OFFSET);
                if (date.getDayOfMonth() == THIRTEEN && date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                    return date;
                }
            }
        };
        return startDate.with(nextFriday13th);
    }
}

package edu.hw5.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

public class DateDashParser extends DateParser {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-d");

    @Override
    public Optional<LocalDate> tryParse(String input) {
        try {
            return Optional.of(LocalDate.parse(input, formatter1));
        } catch (DateTimeParseException firstException) {
            try {
                return Optional.of(LocalDate.parse(input, formatter2));
            } catch (DateTimeParseException secondException) {
                return Optional.empty();
            }
        }
    }
}

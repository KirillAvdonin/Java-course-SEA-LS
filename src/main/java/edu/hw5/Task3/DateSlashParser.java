package edu.hw5.Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Optional;

public class DateSlashParser extends DateParser {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d/M/yyyy");
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/M/yy");

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

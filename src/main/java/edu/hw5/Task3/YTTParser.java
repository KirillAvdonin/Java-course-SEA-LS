package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public class YTTParser extends DateParser {
    @Override
    public Optional<LocalDate> tryParse(String input) {
        if (input.equalsIgnoreCase("tomorrow")) {
            return Optional.of(LocalDate.now().plusDays(1));
        } else if (input.equalsIgnoreCase("yesterday")) {
            return Optional.of(LocalDate.now().minusDays(1));
        } else if (input.equalsIgnoreCase("today")) {
            return Optional.of(LocalDate.now());
        }
        return Optional.empty();
    }
}

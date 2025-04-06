package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public abstract class DateParser {
    private DateParser nextParser;

    public void setNextParser(DateParser nextParser) {
        this.nextParser = nextParser;
    }

    public Optional<LocalDate> parse(String input) {
        Optional<LocalDate> date = tryParse(input);
        if (date.isPresent()) {
            return date;
        }
        if (nextParser != null) {
            return nextParser.parse(input);
        }
        return Optional.empty();
    }

    public abstract Optional<LocalDate> tryParse(String input);
}



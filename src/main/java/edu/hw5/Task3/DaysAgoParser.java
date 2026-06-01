package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DaysAgoParser extends DateParser {
    private static final Pattern DAYS_AGO_PATTERN = Pattern.compile("(\\d+)\\s+day(?:s)?\\s+ago");

    @Override
    public Optional<LocalDate> tryParse(String input) {
        Matcher matcher = DAYS_AGO_PATTERN.matcher(input.toLowerCase());
        if (matcher.matches()) {
            try {
                int days = Integer.parseInt(matcher.group(1));
                return Optional.of(LocalDate.now().minusDays(days));
            } catch (NumberFormatException e) {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}

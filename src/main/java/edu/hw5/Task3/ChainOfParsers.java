package edu.hw5.Task3;

import java.time.LocalDate;
import java.util.Optional;

public class ChainOfParsers {
    private ChainOfParsers() {

    }

    public static Optional<LocalDate> parseDate(String string) {

        DateParser parser1 = new DateDashParser();
        DateParser parser2 = new DateSlashParser();
        DateParser parser3 = new YTTParser();
        DateParser parser4 = new DaysAgoParser();

        parser1.setNextParser(parser2);
        parser2.setNextParser(parser3);
        parser3.setNextParser(parser4);

        return parser1.parse(string);
    }

}

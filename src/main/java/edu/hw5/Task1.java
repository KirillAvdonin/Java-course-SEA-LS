package edu.hw5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private Task1() {

    }

    public static String averageTimePerSession(List<String> sessions) {
        long countOfSessions = 0L;

        StringBuilder result = new StringBuilder();
        Duration totalDuration = Duration.ZERO;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm");
        Pattern pattern =
            Pattern.compile("(\\d{4}-\\d{2}-\\d{2}, \\d{2}:\\d{2})\\s*-\\s*(\\d{4}-\\d{2}-\\d{2}, \\d{2}:\\d{2})");

        Duration duration;
        LocalDateTime startTime;
        LocalDateTime endTime;

        if (sessions == null || sessions.isEmpty()) {
            throw new RuntimeException("Лист пуст или равен null");
        }
        for (String session : sessions) {
            if (!session.isEmpty()) {
                Matcher matcher = pattern.matcher(session);
                if (matcher.matches()) {
                    String startTimeStr = matcher.group(1);
                    String endTimeStr = matcher.group(2);

                    startTime = LocalDateTime.parse(startTimeStr, formatter);
                    endTime = LocalDateTime.parse(endTimeStr, formatter);

                    duration = Duration.between(startTime, endTime);
                    totalDuration = totalDuration.plus(duration);
                    countOfSessions++;
                } else {
                    throw new RuntimeException(
                        "Некорректный ввод данных о сессии, введите в формате yyyy-MM-dd, HH:MM - yyyy-MM-dd, HH:MM");
                }
            } else {
                throw new RuntimeException("Сессия пуста или равна null");
            }
        }
        totalDuration = totalDuration.dividedBy(countOfSessions);

        return result.append("Среднее количество времени, проведенного в компьютерном клубе:")
            .append(totalDuration.toHoursPart()).append("ч ").append(totalDuration.toMinutesPart()).append("м")
            .toString();
    }

}



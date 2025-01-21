package edu.project1.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

public class GetRandomWord implements Dictionary {
    private final Random random = new Random();

    @Override
    public @NotNull String getRandomWord() {
        List<String> words;

        try {
            words = Files.readAllLines(Path.of(
                "C:/Users/kiruh/IdeaProjects/Java-course-SEA-LS/src/main/java/edu/project1/resources/dictionary.txt"));
        } catch (IOException e) {
            throw new RuntimeException("Словарь пуст");
        }
        return words.get(random.nextInt(words.size()));
    }
}

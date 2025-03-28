package edu.hw4;

import java.util.HashSet;
import java.util.Set;

public record Animal(
    String name,
    Type type,
    Sex sex,
    int age,
    int height,
    int weight,
    boolean bites
) {
    private static final int COUNT_OF_CAT_OR_DOG_LEGS = 4;
    private static final int COUNT_OF_BIRD_LEGS = 2;
    private static final int COUNT_OF_FISH_LEGS = 0;
    private static final int COUNT_OF_SPIDER_LEGS = 8;

    enum Type {
        BIRD, CAT, DOG, FISH, SPIDER
    }

    enum Sex {
        M, F
    }

    public int paws() {
        return switch (type) {
            case CAT, DOG -> COUNT_OF_CAT_OR_DOG_LEGS;
            case BIRD -> COUNT_OF_BIRD_LEGS;
            case FISH -> COUNT_OF_FISH_LEGS;
            case SPIDER -> COUNT_OF_SPIDER_LEGS;
        };
    }

    public static Set<ValidationError> animalWithErrors(Animal animal) {
        Set<ValidationError> errors = new HashSet<>();
        if (animal.age <= 0) {
            errors.add(new ValidationError("Возраст не может быть меньше или равен нулю"));
        } else if (animal.height <= 0) {
            errors.add(new ValidationError("Рост не может быть меньше или равен нулю"));
        } else if (animal.weight <= 0) {
            errors.add(new ValidationError("Вес не может быть меньше или равен нулю"));
        }

        return errors;
    }

}

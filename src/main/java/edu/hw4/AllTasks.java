package edu.hw4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AllTasks {
    private AllTasks() {

    }

    private static final int ANIMAL_HEIGHT_FOR_ELEVEN_TASK = 100;
    private static final Logger LOGGER = Logger.getGlobal();

    //Задача 1.Отсортировать животных по росту от самого маленького к самому большому -> List<Animal>
    public static List<Animal> task1(List<Animal> animalsForFirstTask) {
        return animalsForFirstTask.stream()
            .filter(Objects::nonNull)
            .sorted(Comparator.comparing(Animal::height))
            .toList();
    }

    //Задача 2.Отсортировать животных по весу от самого тяжелого к самому легкому, выбрать k первых -> List<Animal>
    public static List<Animal> task2(List<Animal> animalsForSecondTask, int k) {
        return animalsForSecondTask.stream()
            .filter(Objects::nonNull)
            .sorted(Comparator.comparingInt(Animal::weight).reversed())
            .limit(k)
            .toList();
    }

    //Задача 3.Сколько животных каждого вида -> Map<Animal.Type, Integer>
    public static Map<Animal.Type, Integer> task3(List<Animal> animalsForThirdTask) {
        return animalsForThirdTask.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.groupingBy(
                Animal::type,
                Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
            ));
    }

    //Задача 4.У какого животного самое длинное имя -> Animal
    public static Animal task4(List<Animal> animalsForFourthTask) {
        return animalsForFourthTask.stream()
            .filter(Objects::nonNull)
            .max(Comparator.comparing(animal -> animal.name().length()))
            .get();
    }

    //Задача 5.Каких животных больше: самцов или самок -> Sex
    public static Animal.Sex task5(List<Animal> animalsForFifthTask) {
        Map<Animal.Sex, Long> animalsMap = animalsForFifthTask.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.groupingBy(Animal::sex, Collectors.counting()));

        if (animalsMap.get(Animal.Sex.M) > animalsMap.get(Animal.Sex.F)) {
            return Animal.Sex.M;
        } else if (Objects.equals(animalsMap.get(Animal.Sex.F), animalsMap.get(Animal.Sex.M))) {
            LOGGER.info("M = F");
        }
        return Animal.Sex.F;
    }

    //Задача 6.Самое тяжелое животное каждого вида -> Map<Animal.Type, Animal>
    public static Map<Animal.Type, Animal> task6(List<Animal> animals) {
        return animals.stream()
            .filter(Objects::nonNull)
            .collect(Collectors.groupingBy(
                Animal::type,
                Collectors.maxBy(Comparator.comparingInt(Animal::weight))
            ))
            .entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().orElse(null)
            ));
    }

    //Задача 7.Kакое самое старое животное -> Animal
    public static Animal task7(List<Animal> animalsForSeventhTask) {
        return animalsForSeventhTask.stream()
            .filter(Objects::nonNull)
            .max(Comparator.comparingInt(Animal::age))
            .get();
    }

    //Задача 8.Самое тяжелое животное среди животных ниже k см -> Optional<Animal>
    public static Optional<Animal> task8(List<Animal> animalsForEighthTask, int k) {
        return animalsForEighthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.height() < k)
            .max(Comparator.comparingInt(Animal::weight));
    }

    //Задача 9.Сколько в сумме лап у животных в списке -> Integer
    public static Integer task9(List<Animal> animalsForNinthTask) {
        return animalsForNinthTask.stream()
            .filter(Objects::nonNull)
            .mapToInt(Animal::paws)
            .sum();
    }

    //Задача 10.Список животных, возраст у которых не совпадает с количеством лап -> List<Animal>
    public static List<Animal> task10(List<Animal> animalsForTenthTask) {
        return animalsForTenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.age() != animal.paws())
            .toList();
    }

    //Задача 11.Список животных, которые могут укусить (bites == true) и рост которых превышает 100 см -> List<Animal>
    public static List<Animal> task11(List<Animal> animalsForEleventhTask) {
        return animalsForEleventhTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.bites() && animal.height() > ANIMAL_HEIGHT_FOR_ELEVEN_TASK)
            .toList();
    }

    //Задача 12.Сколько в списке животных, вес которых превышает рост -> Integer
    public static Integer task12(List<Animal> animalsForTwelvethTask) {
        return Math.toIntExact(animalsForTwelvethTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.weight() > animal.height())
            .count());
    }

    //Задача 13.Список животных, имена которых состоят из более чем двух слов -> List<Animal>
    public static List<Animal> task13(List<Animal> animalsForThirteenthTask) {
        return animalsForThirteenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.name().contains(" "))
            .toList();
    }

    //Задача 14.Есть ли в списке собака ростом более k см -> Boolean
    public static boolean task14(List<Animal> animalsForFourteenthTask, int k) {
        boolean isHaveDog = animalsForFourteenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.type() == Animal.Type.DOG && animal.height() > k)
            .toList()
            .isEmpty();
        return !isHaveDog;
    }

    //Задача 15.Найти суммарный вес животных каждого вида, которым от k до l лет -> Map<Animal.Type, Integer>
    public static Map<Animal.Type, Integer> task15(List<Animal> animalsForFifteenthTask, int k) {
        return animalsForFifteenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.age() <= 1 && animal.age() >= k)
            .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(Animal::weight)));
    }

    //Задача 16.Список животных, отсортированный по виду, затем по полу, затем по имени -> List<Animal>
    public static List<Animal> task16(List<Animal> animalsForSixteenthTask) {
        return animalsForSixteenthTask.stream()
            .filter(Objects::nonNull)
            .sorted(Comparator.comparing(Animal::type)
                .thenComparing(Animal::sex)
                .thenComparing(Animal::name))
                .toList();
    }

    //Задача 17.Правда ли, что пауки кусаются чаще, чем собаки -> Boolean (если данных для ответа недостаточно,
    // вернуть false)
    public static boolean task17(List<Animal> animalsForSeventeenthTask) {
        Map<Animal.Type, Long> animalsMap = animalsForSeventeenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> animal.bites() && (animal.type() == Animal.Type.DOG
                || animal.type() == Animal.Type.SPIDER))
            .collect(Collectors.groupingBy(Animal::type, Collectors.counting()));

        if (animalsMap.get(Animal.Type.SPIDER) == null || animalsMap.get(Animal.Type.DOG) == null) {
            return false;
        }

        return animalsMap.get(Animal.Type.SPIDER) > animalsMap.get(Animal.Type.DOG);
    }

    //Задача 18.Найти самую тяжелую рыбку в 2-х или более списках -> Animal
    public static Animal task18(List<List<Animal>> animalsForEighteenthTask) {
        return animalsForEighteenthTask.stream()
            .filter(Objects::nonNull)
            .flatMap(Collection::stream)
            .filter(animal -> animal.type() == Animal.Type.FISH)
            .max(Comparator.comparingInt(Animal::weight))
            .get();
    }

    //Задача 19.Животные, в записях о которых есть ошибки: вернуть имя и список ошибок
    // -> Map<String, Set<ValidationError>>.
    public static Map<String, Set<ValidationError>> task19(List<Animal> animalsForNineteenthTask) {
        return animalsForNineteenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> !Animal.animalWithErrors(animal).isEmpty())
            .collect(Collectors.toMap(Animal::name, Animal::animalWithErrors));
    }

    //Задача 20.Животные, в записях о которых есть ошибки: вернуть имя и список ошибок
    // -> Map<String, Set<ValidationError>>.
    public static Map<String, String> task20(List<Animal> animalsForNineteenthTask) {
        return animalsForNineteenthTask.stream()
            .filter(Objects::nonNull)
            .filter(animal -> !Animal.animalWithErrors(animal).isEmpty())
            .collect(Collectors.toMap(
                Animal::name,
                animal -> Animal.animalWithErrors(animal).stream()
                    .map(ValidationError::getError) // Получаем сообщение об ошибке
                    .collect(Collectors.joining(", ")) // Объединяем в строку через запятую
            ));
    }
}


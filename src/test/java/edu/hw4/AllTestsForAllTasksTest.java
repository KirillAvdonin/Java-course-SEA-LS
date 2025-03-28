package edu.hw4;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllTestsForAllTasksTest {

    public final List<Animal> animals = Arrays.asList(
        new Animal("Барсик", Animal.Type.CAT, Animal.Sex.M, 4, 25, 5, false),
        new Animal("Рекс", Animal.Type.DOG, Animal.Sex.M, 7, 60, 20, true),
        new Animal("Кеша", Animal.Type.BIRD, Animal.Sex.F, 3, 15, 1, false),
        new Animal("Немо", Animal.Type.FISH, Animal.Sex.M, 1, 5, 0, false),
        new Animal("Павук", Animal.Type.SPIDER, Animal.Sex.F, 5, 10, 2, true),
        new Animal("Мурка", Animal.Type.CAT, Animal.Sex.F, 5, 30, 7, false),
        new Animal("Бобик Шарикович", Animal.Type.DOG, Animal.Sex.M, 10, 101, 25, true),
        new Animal("Рио", Animal.Type.BIRD, Animal.Sex.M, 1, 12, 1, false),
        new Animal("Дори", Animal.Type.FISH, Animal.Sex.F, 2, 7, 1, false),
        new Animal("Тарантулио", Animal.Type.SPIDER, Animal.Sex.M, 8, 12, 3, true),
        new Animal("Пушок", Animal.Type.CAT, Animal.Sex.M, 0, 20, 4, false),
        new Animal("Белла", Animal.Type.DOG, Animal.Sex.F, 5, 55, 18, false),
        new Animal("Чирик", Animal.Type.BIRD, Animal.Sex.F, 3, 18, 2, false),
        new Animal("Золотыш", Animal.Type.FISH, Animal.Sex.F, 3, 6, 0, false),
        new Animal("Черная вдова", Animal.Type.SPIDER, Animal.Sex.F, 7, 11, 2, true),
        new Animal("Большой босс", Animal.Type.CAT, Animal.Sex.M, 0, 28, 6, false)
    );

    @Test
    void task1Test() {
        List<Animal> sortedAnimals = AllTasks.task1(animals);
        assertEquals("Немо", sortedAnimals.get(0).name());
        assertEquals("Золотыш", sortedAnimals.get(1).name());
        assertEquals("Дори", sortedAnimals.get(2).name());
        assertEquals("Павук", sortedAnimals.get(3).name());
        assertEquals("Черная вдова", sortedAnimals.get(4).name());
    }

    @Test
    void task2Test() {
        List<Animal> sortedAnimals = AllTasks.task2(animals, 3);
        assertEquals("Бобик Шарикович", sortedAnimals.get(0).name());
        assertEquals("Рекс", sortedAnimals.get(1).name());
        assertEquals("Белла", sortedAnimals.get(2).name());
    }

    @Test
    void task3Test() {
        Map<Animal.Type, Integer> animalCounts = AllTasks.task3(animals);
        assertEquals(4, animalCounts.get(Animal.Type.CAT));
        assertEquals(3, animalCounts.get(Animal.Type.DOG));
        assertEquals(3, animalCounts.get(Animal.Type.BIRD));
        assertEquals(3, animalCounts.get(Animal.Type.FISH));
        assertEquals(3, animalCounts.get(Animal.Type.SPIDER));
    }

    @Test
    void task4Test() {
        Animal longestNameAnimal = AllTasks.task4(animals);
        assertEquals("Бобик Шарикович", longestNameAnimal.name());
    }

    @Test
    void task5Test_malesMore() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Марсель", Animal.Type.CAT, Animal.Sex.M, 1, 10, 1, false),
            new Animal("Мажор", Animal.Type.CAT, Animal.Sex.M, 1, 10, 1, false),
            new Animal("Люксовый", Animal.Type.CAT, Animal.Sex.F, 1, 10, 1, false)
        );
        assertEquals(Animal.Sex.M, AllTasks.task5(testAnimals));
    }

    @Test
    void task5Test_femalesMore() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Люксовый", Animal.Type.CAT, Animal.Sex.M, 1, 10, 1, false),
            new Animal("Люси", Animal.Type.CAT, Animal.Sex.F, 1, 10, 1, false),
            new Animal("Машка", Animal.Type.CAT, Animal.Sex.F, 1, 10, 1, false)
        );
        assertEquals(Animal.Sex.F, AllTasks.task5(testAnimals));
    }

    @Test
    void task5Test_equal() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Марсель", Animal.Type.CAT, Animal.Sex.M, 1, 10, 1, false),
            new Animal("Машка", Animal.Type.CAT, Animal.Sex.F, 1, 10, 1, false)
        );
        assertEquals(Animal.Sex.F, AllTasks.task5(testAnimals));
    }

    @Test
    void task6Test() {
        Map<Animal.Type, Animal> heaviestByType = AllTasks.task6(animals);
        assertEquals("Мурка", heaviestByType.get(Animal.Type.CAT).name());
        assertEquals("Бобик Шарикович", heaviestByType.get(Animal.Type.DOG).name());
        assertEquals("Чирик", heaviestByType.get(Animal.Type.BIRD).name());
        assertEquals("Дори", heaviestByType.get(Animal.Type.FISH).name());
        assertEquals("Тарантулио", heaviestByType.get(Animal.Type.SPIDER).name());
    }

    @Test
    void task7Test() {
        Animal oldestAnimal = AllTasks.task7(animals);
        assertEquals("Бобик Шарикович", oldestAnimal.name());
    }

    @Test
    void task8Test() {
        Optional<Animal> heaviestBelow30 = AllTasks.task8(animals, 30);
        assertTrue(heaviestBelow30.isPresent());
        assertEquals("Большой босс", heaviestBelow30.get().name());
    }

    @Test
    void task9Test() {
        Integer totalPaws = AllTasks.task9(animals);
        assertEquals(58, totalPaws);
    }

    @Test
    void task10Test() {
        List<Animal> result = AllTasks.task10(animals);
        assertTrue(result.stream().anyMatch(a -> a.name().equals("Рекс")));
        assertTrue(result.stream().anyMatch(a -> a.name().equals("Кеша")));
        assertFalse(result.stream().anyMatch(a -> a.name().equals("Тарантулио")));
        assertFalse(result.stream().anyMatch(a -> a.name().equals("Барсик")));
    }

    @Test
    void task11Test() {
        List<Animal> bitingAndTallAnimals = AllTasks.task11(animals);
        assertEquals("Бобик Шарикович", bitingAndTallAnimals.get(0).name());
    }

    @Test
    void task12Test() {
        Integer count = AllTasks.task12(animals);
        Integer expectedCount = Math.toIntExact(animals.stream().filter(a -> a.weight() > a.height()).count());
        assertEquals(expectedCount, count);
    }

    @Test
    void task13Test() {
        List<Animal> multiWordNameAnimals = AllTasks.task13(animals);
        assertTrue(multiWordNameAnimals.stream().anyMatch(a -> a.name().equals("Большой босс")));
        assertTrue(multiWordNameAnimals.stream().anyMatch(a -> a.name().equals("Бобик Шарикович")));
    }

    @Test
    void task14Test_False() {
        assertFalse(AllTasks.task14(animals, 105));
    }

    @Test
    void task14Test_True() {
        assertTrue(AllTasks.task14(animals, 10));
    }

    @Test
    void task15Test_validRange() {
        Map<Animal.Type, Integer> weightSum = AllTasks.task15(animals, 0);
        assertEquals(10, weightSum.get(Animal.Type.CAT));
        assertNull(weightSum.get(Animal.Type.SPIDER));
    }

    @Test
    void task15Test_noMatch() {
        Map<Animal.Type, Integer> weightSum = AllTasks.task15(animals, 5);
        assertTrue(weightSum.isEmpty());
    }

    @Test
    void task16Test() {
        List<Animal> sortedAnimals = AllTasks.task16(animals);
        assertEquals(Animal.Type.BIRD, sortedAnimals.getFirst().type());
        assertEquals(Animal.Sex.M, sortedAnimals.getFirst().sex());
        assertEquals("Рио", sortedAnimals.getFirst().name());

        assertEquals(Animal.Type.BIRD, sortedAnimals.get(1).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(1).sex());
        assertEquals("Кеша", sortedAnimals.get(1).name());

        assertEquals(Animal.Type.BIRD, sortedAnimals.get(2).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(2).sex());
        assertEquals("Чирик", sortedAnimals.get(2).name());

        assertEquals(Animal.Type.CAT, sortedAnimals.get(3).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(3).sex());
        assertEquals("Барсик", sortedAnimals.get(3).name());

        assertEquals(Animal.Type.CAT, sortedAnimals.get(4).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(4).sex());
        assertEquals("Большой босс", sortedAnimals.get(4).name());

        assertEquals(Animal.Type.CAT, sortedAnimals.get(5).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(5).sex());
        assertEquals("Пушок", sortedAnimals.get(5).name());

        assertEquals(Animal.Type.CAT, sortedAnimals.get(6).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(6).sex());
        assertEquals("Мурка", sortedAnimals.get(6).name());

        assertEquals(Animal.Type.DOG, sortedAnimals.get(7).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(7).sex());
        assertEquals("Бобик Шарикович", sortedAnimals.get(7).name());

        assertEquals(Animal.Type.DOG, sortedAnimals.get(8).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(8).sex());
        assertEquals("Рекс", sortedAnimals.get(8).name());

        assertEquals(Animal.Type.DOG, sortedAnimals.get(9).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(9).sex());
        assertEquals("Белла", sortedAnimals.get(9).name());

        assertEquals(Animal.Type.FISH, sortedAnimals.get(10).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(10).sex());
        assertEquals("Немо", sortedAnimals.get(10).name());

        assertEquals(Animal.Type.FISH, sortedAnimals.get(11).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(11).sex());
        assertEquals("Дори", sortedAnimals.get(11).name());

        assertEquals(Animal.Type.FISH, sortedAnimals.get(12).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(12).sex());
        assertEquals("Золотыш", sortedAnimals.get(12).name());

        assertEquals(Animal.Type.SPIDER, sortedAnimals.get(13).type());
        assertEquals(Animal.Sex.M, sortedAnimals.get(13).sex());
        assertEquals("Тарантулио", sortedAnimals.get(13).name());

        assertEquals(Animal.Type.SPIDER, sortedAnimals.get(14).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(14).sex());
        assertEquals("Павук", sortedAnimals.get(14).name());

        assertEquals(Animal.Type.SPIDER, sortedAnimals.get(15).type());
        assertEquals(Animal.Sex.F, sortedAnimals.get(15).sex());
        assertEquals("Черная вдова", sortedAnimals.get(15).name());
    }

    @Test
    void task17Test_spidersMore() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.F, 1, 1, 1, true),
            new Animal("Spider2", Animal.Type.SPIDER, Animal.Sex.M, 1, 1, 1, true),
            new Animal("Dog1", Animal.Type.DOG, Animal.Sex.M, 1, 1, 1, true)
        );
        assertTrue(AllTasks.task17(testAnimals));
    }

    @Test
    void task17Test_dogsMore() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.F, 1, 1, 1, true),
            new Animal("Dog1", Animal.Type.DOG, Animal.Sex.M, 1, 1, 1, true),
            new Animal("Dog2", Animal.Type.DOG, Animal.Sex.F, 1, 1, 1, true)
        );
        assertFalse(AllTasks.task17(testAnimals));
    }

    @Test
    void task17Test_equal() {
        List<Animal> testAnimals = Arrays.asList(
            new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.F, 1, 1, 1, true),
            new Animal("Dog1", Animal.Type.DOG, Animal.Sex.M, 1, 1, 1, true)
        );
        assertFalse(AllTasks.task17(testAnimals));
    }

    @Test
    void task17Test_onlySpiders() {
        List<Animal> testAnimals = List.of(
            new Animal("Spider1", Animal.Type.SPIDER, Animal.Sex.F, 1, 1, 1, true)
        );
        assertFalse(AllTasks.task17(testAnimals));
    }

    @Test
    void task17Test_onlyDogs() {
        List<Animal> testAnimals = List.of(
            new Animal("Dog1", Animal.Type.DOG, Animal.Sex.M, 1, 1, 1, true)
        );
        assertFalse(AllTasks.task17(testAnimals));
    }

    @Test
    void task18Test() {
        List<Animal> fishList1 = Arrays.asList(
            new Animal("Fish1", Animal.Type.FISH, Animal.Sex.M, 1, 1, 5, false),
            new Animal("Other1", Animal.Type.CAT, Animal.Sex.F, 2, 2, 10, false)
        );
        List<Animal> fishList2 = Arrays.asList(
            new Animal("Fish2", Animal.Type.FISH, Animal.Sex.F, 3, 3, 8, false),
            new Animal("Other2", Animal.Type.DOG, Animal.Sex.M, 4, 4, 15, true)
        );
        List<List<Animal>> listOfAnimalLists = Arrays.asList(fishList1, fishList2);
        Animal heaviestFish = AllTasks.task18(listOfAnimalLists);
        assertEquals("Fish2", heaviestFish.name());
    }

    @Test
    void task18Test_emptyList() {
        List<Animal> emptyList = List.of();
        List<List<Animal>> listOfAnimalLists = Arrays.asList(emptyList, emptyList);
        assertThrows(java.util.NoSuchElementException.class, () -> AllTasks.task18(listOfAnimalLists));
    }

    @Test
    void testTask19_withProvidedAnimals() {
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal("Черная вдова", Animal.Type.SPIDER, Animal.Sex.F, 12, -11, 2, true));
        animalsList.add(new Animal("Большой босс", Animal.Type.CAT, Animal.Sex.M, 0, 28, 6, false));
        animalsList.add(new Animal("Конан", Animal.Type.CAT, Animal.Sex.M, 2, 28, -6, false));

        Map<String, Set<ValidationError>> result = AllTasks.task19(animalsList);
        assertEquals(3, result.size());

        assertTrue(result.containsKey("Черная вдова"));
        assertEquals(1, result.get("Черная вдова").size());
        assertTrue(result.get("Черная вдова").stream()
            .anyMatch(e -> e.getError().equals("Рост не может быть меньше или равен нулю")));

        assertTrue(result.containsKey("Большой босс"));
        assertEquals(1, result.get("Большой босс").size());
        assertTrue(result.get("Большой босс").stream()
            .anyMatch(e -> e.getError().equals("Возраст не может быть меньше или равен нулю")));

        assertTrue(result.containsKey("Конан"));
        assertEquals(1, result.get("Конан").size());
        assertTrue(result.get("Конан").stream()
            .anyMatch(e -> e.getError().equals("Вес не может быть меньше или равен нулю")));
    }

    @Test
    void task19Test_noErrorsWithProvidedAnimals() {
        List<Animal> validAnimals = animals.stream()
            .filter(animal -> animal.age() < 0)
            .collect(Collectors.toList());
        Map<String, Set<ValidationError>> result = AllTasks.task19(validAnimals);
        assertTrue(result.isEmpty());
    }

    @Test
    void Task20Test_withProvidedAnimals() {
        Map<String, String> result = AllTasks.task20(animals);
        assertEquals(4, result.size());

        assertEquals("Возраст не может быть меньше или равен нулю", result.get("Пушок"));
        assertEquals("Возраст не может быть меньше или равен нулю", result.get("Большой босс"));
    }

    @Test
    void Task20Test_noErrorsWithProvidedAnimals() {
        List<Animal> validAnimals = animals.stream()
            .filter(animal -> animal.age() < 0)
            .collect(Collectors.toList());
        Map<String, String> result = AllTasks.task20(validAnimals);
        assertTrue(result.isEmpty());
    }

}


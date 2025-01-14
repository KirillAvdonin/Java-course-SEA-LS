package edu.hw1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task6Test {
    @Test
    @DisplayName("Постоянная Капрекара тест 1")
    void KaprekarsConstantFirstTest() {
        int test1 = Task6.countK(3524);
        Assertions.assertEquals(3, test1);
    }

    @Test
    @DisplayName("Постоянная Капрекара")
    void KaprekarsConstantSecondTest() {
        int test2 = Task6.countK(6621);
        Assertions.assertEquals(5, test2);
    }

    @Test
    @DisplayName("Постоянная Капрекара")
    void KaprekarsConstantThirirdTest() {
        int test3 = Task6.countK(6554);
        Assertions.assertEquals(4, test3);
    }

    @Test
    @DisplayName("Постоянная Капрекара")
    void KaprekarsConstantFourthTest() {;
        int test4 = Task6.countK(1234);
        Assertions.assertEquals(3, test4);
    }
}



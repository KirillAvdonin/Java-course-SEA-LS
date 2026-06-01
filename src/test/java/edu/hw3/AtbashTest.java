package edu.hw3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.hw3.Atbash.atbash;

class AtbashTest {

    @Test
    void atbashTest() {
        assertEquals("Svool dliow!", atbash("Hello world!"));

        assertEquals(
            "Zmb ullo xzm dirgv xlwv gszg z xlnkfgvi xzm fmwvihgzmw. Tllw kiltiznnvih dirgv xlwv gszg sfnzmh xzm fmwvihgzmw. ― Nzigrm Uldovi",
            atbash(
                "Any fool can write code that a computer can understand. Good programmers write code that humans can understand. ― Martin Fowler")
        );

        assertEquals(
            "Тестовое предложение, для проверки шифрования",
            atbash("Тестовое предложение, для проверки шифрования")
        );

        assertEquals(
            "П0 ст4тистике к4ждый третий человек на планете программист))))))",
            atbash("П0 ст4тистике к4ждый третий человек на планете программист))))))")
        );

        assertThatThrownBy(() -> atbash(null)).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("Строка не должна быть null");

        assertThatThrownBy(() -> atbash("")).isInstanceOf(IllegalArgumentException.class)
            .hasMessageContaining("Строка не должна быть пустой");
    }
}

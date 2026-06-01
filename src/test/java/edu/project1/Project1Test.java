package edu.project1;

import edu.project1.Session.Session;
import edu.project1.guessResult.Defeat;
import edu.project1.guessResult.FailedGuess;
import edu.project1.guessResult.GiveUp;
import edu.project1.guessResult.GuessResult;
import edu.project1.guessResult.SuccessfulGuess;
import edu.project1.guessResult.Win;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class Project1Test {

    @Test
    public void initGameTest() {
        Session session = new Session();

        session.initGame();

        assertNotNull(session.getWord());
        assertFalse(session.getWord().isEmpty());
        assertEquals(session.getEncryptedWord(), "*".repeat(session.getWord().length()));
        assertEquals(0, session.getMistakes());
    }

    @Test
    public void isCorrectlyInputTest() {
        Session session = new Session();
        HashSet<Character> enteredLetters = new HashSet<>();
        String letter = "о";

        enteredLetters.add(letter.charAt(0));
        session.setEnteredLetters(enteredLetters);

        assertTrue(session.isCorrectlyInput("д"));
        assertFalse(session.isCorrectlyInput("о"));
        assertFalse(session.isCorrectlyInput("j"));
    }

    @Test
    public void GuessResultRecordsTest() {
        GuessResult defeat = new Defeat("лошадь", 8);
        GuessResult failedGuess = new FailedGuess("*****", 1);
        GuessResult giveUp = new GiveUp("статуя", 3);
        GuessResult successfulGuess = new SuccessfulGuess("л***дь", 4);
        GuessResult win = new Win("работа", 5);

        assertEquals("лошадь", defeat.encryptedWord());
        assertEquals(8, defeat.mistakes());
        assertEquals(8, defeat.maxMistakes());
        assertEquals(
            "\nКоличество ошибок:" + defeat.mistakes() + " из " + defeat.maxMistakes() +
                "\nК сожалению, вы проиграли!( \nЗагаданное слово:" + defeat.encryptedWord() +
                " \nЖелаете сыграть еще раз?", defeat.message()
        );

        assertEquals("*****", failedGuess.encryptedWord());
        assertEquals(1, failedGuess.mistakes());
        assertEquals(8, failedGuess.maxMistakes());
        assertEquals(
            "\nПромах! \nКоличество ошибок: " + failedGuess.mistakes() + " из " + failedGuess.maxMistakes() +
                "\nЗагаданное слово: " + failedGuess.encryptedWord(), failedGuess.message()
        );

        assertEquals("статуя", giveUp.encryptedWord());
        assertEquals(3, giveUp.mistakes());
        assertEquals(8, giveUp.maxMistakes());
        assertEquals(
            "\nВы сдались! Количество ошибок" + giveUp.mistakes() + " из " + giveUp.maxMistakes() +
                "\nЗагаданное слово: " + giveUp.encryptedWord() + "\nЖелаете сыграть еще раз?\n", giveUp.message()
        );

        assertEquals("л***дь", successfulGuess.encryptedWord());
        assertEquals(4, successfulGuess.mistakes());
        assertEquals(8, successfulGuess.maxMistakes());
        assertEquals(
            "\nПопадание! \nКоличество ошибок: " + successfulGuess.mistakes() + " из " + successfulGuess.maxMistakes() +
                "\nЗагаданное слово: " + successfulGuess.encryptedWord(), successfulGuess.message()
        );

        assertEquals("работа", win.encryptedWord());
        assertEquals(5, win.mistakes());
        assertEquals(8, win.maxMistakes());
        assertEquals(
            "\nПоздравляем, вы выиграли! \nВаше количество ошибок: " + win.mistakes() + " из " + win.maxMistakes() +
                "\nЖелаете сыграть еще раз?", win.message()
        );

    }

}

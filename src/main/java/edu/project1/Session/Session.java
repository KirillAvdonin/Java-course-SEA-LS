package edu.project1.Session;

import edu.project1.dictionary.Dictionary;
import edu.project1.dictionary.GetRandomWord;
import edu.project1.guessResult.Defeat;
import edu.project1.guessResult.FailedGuess;
import edu.project1.guessResult.GiveUp;
import edu.project1.guessResult.GuessResult;
import edu.project1.guessResult.SuccessfulGuess;
import edu.project1.guessResult.Win;
import java.util.HashSet;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Session {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_MISTAKES = 8;

    private final Dictionary dictionary;
    private HashSet<Character> enteredLetters;

    private StringBuilder encryptedWord;
    private String word;
    private int mistakes;

    public Session() {
        this.dictionary = new GetRandomWord();
        this.enteredLetters = new HashSet<>();
        this.encryptedWord = new StringBuilder();
    }

    public void goToMainMenu() {
        LOGGER.info(
            """
                -------------------------\

                  1. Начать новую игру \

                  2. Выйти из игры\

                ------------------------""");

        int choice = SCANNER.nextInt();

        switch (choice) {
            case (1): {
                startGame();
                break;
            }
            case (2): {
                break;
            }
            default: {
                LOGGER.info("\nНекорректный ввод, повторите свой выбор");

                goToMainMenu();
                break;
            }
        }
    }

    public void initGame() {
        setWord(dictionary.getRandomWord());
        setEncryptedWord(encryptedWord.repeat("*", word.length()));
        setAttempts(mistakes);
    }

    public void startGame() {
        initGame();

        GuessResult guessResult;

        LOGGER.info("\nЗагаданное слово: " + getEncryptedWord());

        while (true) {
            String letter = getUserInput();

            if (letter.contains("-1")) {
                guessResult = new GiveUp(getWord(), getMistakes());

                LOGGER.info(guessResult.message());

                encryptedWord.delete(0, encryptedWord.length());
                enteredLetters.clear();
                mistakes = 0;

                goToMainMenu();
                break;
            }

            if (isCorrectlyInput(letter)) {
                enteredLetters.add(letter.charAt(0));

                if (word.contains(letter)) {

                    for (int i = word.indexOf(letter); i < word.length(); i++) {
                        if (letter.charAt(0) == word.charAt(i)) {
                            encryptedWord.setCharAt(i, letter.charAt(0));
                        }
                    }

                    guessResult = new SuccessfulGuess(getEncryptedWord(), getMistakes());

                    LOGGER.info(guessResult.message());

                } else {
                    mistakes++;
                    guessResult = new FailedGuess(getEncryptedWord(), getMistakes());

                    LOGGER.info(guessResult.message());
                }
            }

            if (encryptedWord.toString().equals(word)) {
                guessResult = new Win(getEncryptedWord(), getMistakes());

                LOGGER.info(guessResult.message());

                encryptedWord.delete(0, encryptedWord.length());
                enteredLetters.clear();
                mistakes = 0;

                goToMainMenu();
                break;
            }

            if (mistakes == MAX_MISTAKES) {
                guessResult = new Defeat(getWord(), getMistakes());

                LOGGER.info(guessResult.message());

                encryptedWord.delete(0, encryptedWord.length());
                enteredLetters.clear();
                mistakes = 0;

                goToMainMenu();
                break;
            }
        }
    }

    public boolean isCorrectlyInput(String letter) {
        if (enteredLetters.contains(letter.charAt(0))) {
            LOGGER.info("\nВы уже вводили эту букву");
            return false;
        } else if (!letter.matches("[а-яА-Я]")) {
            LOGGER.info("\nНекорректный ввод! Введите букву еще раз");
            return false;
        } else {
            return true;
        }
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setEncryptedWord(StringBuilder encryptedWord) {
        this.encryptedWord = encryptedWord;
    }

    public void setAttempts(int mistakes) {
        this.mistakes = mistakes;
    }

    public void setEnteredLetters(HashSet<Character> enteredLetters) {
        this.enteredLetters = enteredLetters;
    }

    public String getEncryptedWord() {
        return encryptedWord.toString();
    }

    public String getWord() {
        return word;
    }

    public int getMistakes() {
        return mistakes;
    }

    public String getUserInput() {
        LOGGER.info("\nВведите букву");
        return SCANNER.next().toLowerCase();
    }
}

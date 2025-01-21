package edu.project1.guessResult;

public record FailedGuess(String encryptedWord, int mistakes) implements GuessResult {

    @Override
    public String encryptedWord() {
        return encryptedWord;
    }

    @Override
    public int mistakes() {
        return mistakes;
    }

    @Override
    public int maxMistakes() {
        return MAX_MISTAKES;
    }

    @Override
    public String message() {
        return "\nПромах! \nКоличество ошибок: " + mistakes() + " из " + maxMistakes() + "\nЗагаданное слово: "
            + encryptedWord();
    }
}

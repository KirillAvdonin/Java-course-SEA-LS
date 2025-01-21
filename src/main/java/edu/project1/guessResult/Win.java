package edu.project1.guessResult;

public record Win(String encryptedWord, int mistakes) implements GuessResult {

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
        return "\nПоздравляем, вы выиграли! \nВаше количество ошибок: " + mistakes() + " из " + maxMistakes()
            + "\nЖелаете сыграть еще раз?";
    }
}

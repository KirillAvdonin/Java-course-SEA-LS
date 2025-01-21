package edu.project1.guessResult;

public record Defeat(String encryptedWord, int mistakes) implements GuessResult {

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
        return "\nКоличество ошибок:" + mistakes() + " из " + maxMistakes()
            + "\nК сожалению, вы проиграли!( \nЗагаданное слово:" + encryptedWord() + " \nЖелаете сыграть еще раз?";
    }
}

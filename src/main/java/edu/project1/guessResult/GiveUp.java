package edu.project1.guessResult;

public record GiveUp(String word, int mistakes) implements GuessResult {

    @Override
    public String encryptedWord() {
        return word;
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
        return "\nВы сдались! Количество ошибок" + mistakes() + " из " + maxMistakes() + "\nЗагаданное слово: "
            + encryptedWord() + "\nЖелаете сыграть еще раз?\n";
    }
}

package edu.project1.guessResult;

public sealed interface GuessResult permits Defeat, Win, SuccessfulGuess, FailedGuess, GiveUp {
    int MAX_MISTAKES = 8;

    String encryptedWord();

    int mistakes();

    int maxMistakes();

    String message();

}

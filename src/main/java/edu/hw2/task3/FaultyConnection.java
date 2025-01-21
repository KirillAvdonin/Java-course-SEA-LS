package edu.hw2.task3;

import java.util.Random;

public class FaultyConnection implements Connection {
    private static final Random RANDOM = new Random();

    @Override
    public void execute(String command) {
        if (RANDOM.nextBoolean()) {
            throw new ConnectionException("Не удалось выполнить команду из-за проблем с соединением");
        }
    }

    @Override
    public void close() throws Exception {
    }
}

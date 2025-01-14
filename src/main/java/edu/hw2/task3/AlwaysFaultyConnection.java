package edu.hw2.task3;

public class AlwaysFaultyConnection implements Connection {

    @Override
    public void execute(String command) {
        throw new ConnectionException("Проблемное соединение, выполнение команд невозможно");
    }

    @Override
    public void close() throws Exception {

    }
}

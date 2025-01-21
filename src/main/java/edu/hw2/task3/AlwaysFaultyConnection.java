package edu.hw2.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AlwaysFaultyConnection implements Connection {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute(String command) {
        throw new ConnectionException("Проблемное соединение, выполнение команд невозможно");
    }

    @Override
    public void close() throws Exception {
    LOGGER.info("Соединение закрыто");
    }
}

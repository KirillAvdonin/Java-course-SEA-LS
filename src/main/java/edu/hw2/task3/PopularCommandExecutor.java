package edu.hw2.task3;

public final class PopularCommandExecutor {

    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    public void tryExecute(String command) {
        int attempts = 0;
        while (attempts < maxAttempts) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                return;
            } catch (ConnectionException e) {
                attempts++;
                if (attempts >= maxAttempts) {
                    throw new ConnectionException("Не удалось выполнить команду после " + maxAttempts + " попыток", e);
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


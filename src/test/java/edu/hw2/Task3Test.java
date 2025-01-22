package edu.hw2;
import edu.hw2.task3.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class Task3Test {

        private ConnectionManager manager;
        private PopularCommandExecutor executor;

        @BeforeEach
        public void setUp() {
            manager = new DefaultConnectionManager();
            executor = new PopularCommandExecutor(manager, 3);
        }

        @Test
        public void testUpdatePackagesSuccess() {
            executor.updatePackages();
        }

        @Test
        public void testTryExecuteSuccess() {
            executor.tryExecute("some command");
        }

        @Test
        public void testTryExecuteFailure()
        {
            manager = new FaultyConnectionManager();
            executor = new PopularCommandExecutor(manager, 3);

            assertThatThrownBy(() -> executor.tryExecute("some command"))
                .isInstanceOf(ConnectionException.class)
                .hasMessageContaining("Не удалось выполнить команду после 3 попыток");
        }

        @Test
        public void testTryExecuteMixedSuccessAndFailure() {
            executor.tryExecute("some command");
        }
    }

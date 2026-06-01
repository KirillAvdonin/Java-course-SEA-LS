package edu.hw3;

import edu.hw3.stockMarket.Stock;
import edu.hw3.stockMarket.StockMarketImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StockMarketTest {
    @Test
    void stockMarketMethodsTest() {
        StockMarketImpl stockMarketTest = new StockMarketImpl();

        Stock test1 = new Stock("Транснефть", 10000);
        Stock test2 = new Stock("Роснефть", 15000);
        Stock test3 = new Stock("Вконтакте", 11300);
        Stock test4 = new Stock("Красное и белое", 100);

        stockMarketTest.add(test1);
        stockMarketTest.add(test2);
        stockMarketTest.add(test3);
        stockMarketTest.add(test4);

        int sizeBeforeRemove = stockMarketTest.stockPriorityQueue.size();
        stockMarketTest.remove(test4);
        int sizeAfterRemove = stockMarketTest.stockPriorityQueue.size();

        assertEquals(
            "Наименовании акции: \"Роснефть\"" + "\nЦена за акцию: 15000",
            stockMarketTest.mostValuableStock().toString()
        );

        assertTrue(sizeAfterRemove != sizeBeforeRemove);
    }

}

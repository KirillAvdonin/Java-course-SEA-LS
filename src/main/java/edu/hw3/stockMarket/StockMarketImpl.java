package edu.hw3.stockMarket;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StockMarketImpl implements StockMarket {

    public PriorityQueue<Stock> stockPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

    @Override
    public void add(Stock stock) {
        stockPriorityQueue.add(stock);
    }

    @Override
    public void remove(Stock stock) {
        stockPriorityQueue.remove(stock);
    }

    @Override
    public Stock mostValuableStock() {
        return stockPriorityQueue.peek();
    }

}

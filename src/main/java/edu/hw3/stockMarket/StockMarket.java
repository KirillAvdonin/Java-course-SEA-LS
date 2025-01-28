package edu.hw3.stockMarket;

public interface StockMarket {
    void add(Stock stock);

    void remove(Stock stock);

    Stock mostValuableStock();
}

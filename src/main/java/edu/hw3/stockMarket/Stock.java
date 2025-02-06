package edu.hw3.stockMarket;

import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;


public class Stock implements Comparable<Stock> {
    private final String name;
    private final Double price;
    DecimalFormat df = new DecimalFormat("#.###");

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Stock stock) {
        return this.price.compareTo(stock.price);
    }

    @Override
    public String toString() {
        return "Наименовании акции: " + "\"" + name + "\"" + "\nЦена за акцию: " + df.format(price);
    }
}

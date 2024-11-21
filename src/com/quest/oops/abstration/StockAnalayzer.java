package com.quest.oops.abstration;

public abstract class StockAnalayzer {
    String stockName;
    String stockSymbol;
    int[] prices;

 public StockAnalayzer(String stockName, String stockSymbol, int[] prices) {
        this.stockName = stockName;
       this.stockSymbol = stockSymbol;
       this.prices = prices;
   }
    abstract int findMaxPrice();

    abstract int findMinPrice();

    abstract double calculateAveragePrice();

    abstract int[] findLongestIncreasingTrend();

    abstract void displayAnalysis();
}



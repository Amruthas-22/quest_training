package com.quest.oops.abstration;

public class EquityStockAnalyzer extends StockAnalayzer {
    String sector;

    public EquityStockAnalyzer(String stockName, String stockSymbol, int[] prices, String sector) {
        super(stockName, stockSymbol, prices);
        this.sector = sector;
    }
    @Override
    int findMaxPrice() {
        int max = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > max) {
                    max = prices[i];
                }
            }
            return max;
        }
        @Override
        int findMinPrice() {
            int min = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                }
            }
            return min;
        }

    @Override
    double calculateAveragePrice() {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return (double) sum / prices.length;
    }


    @Override
    int[] findLongestIncreasingTrend() {
        int maxLength = 0;
        int currentLength = 1;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    end = i - 1;
                }
                currentLength = 1;
                currentStart = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = currentStart;
            end = prices.length - 1;
        }
        int[] result = {start + 1, end + 1, maxLength + 1};
        return result;
    }

    @Override
    void displayAnalysis() {
        System.out.println("Stock Name: " + stockName);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Sector: " + sector);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + trend[0] + ", End Day " + trend[1] + ", Length: " + trend[2] + " days");


    }

}


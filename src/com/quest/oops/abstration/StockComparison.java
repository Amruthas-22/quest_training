package com.quest.oops.abstration;
import java.util.Scanner;
public class StockComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String equityName = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String equitySymbol = scanner.nextLine();
        System.out.print("Sector: ");
        String sector = scanner.nextLine();
        System.out.print("Number of days: ");
        int equityDays = scanner.nextInt();
        int[] equityPrices = new int[equityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < equityDays; i++) {
            equityPrices[i] = scanner.nextInt();
        }
        scanner.nextLine();
        EquityStockAnalyzer equityStock = new EquityStockAnalyzer(equityName, equitySymbol, equityPrices, sector);
        System.out.println("\nEnter details for Commodity Stock:");
        System.out.print("Stock Name: ");
        String commodityName = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditySymbol = scanner.nextLine();
        System.out.print("Commodity Type: ");
        String commodityType = scanner.nextLine();
        System.out.print("Number of days: ");
        int commodityDays = scanner.nextInt();
        int[] commodityPrices = new int[commodityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrices[i] = scanner.nextInt();
        }
        scanner.nextLine();
        CommodityStockAnalyzer commodityStock = new CommodityStockAnalyzer(commodityName, commoditySymbol, commodityPrices, commodityType);
        System.out.println("\nAnalysis for Equity Stock:");
        equityStock.displayAnalysis();

        System.out.println("\nAnalysis for Commodity Stock:");
        commodityStock.displayAnalysis();

        double equityAvg = equityStock.calculateAveragePrice();
        double commodityAvg = commodityStock.calculateAveragePrice();
        System.out.println("\nComparison Results:");
        if (equityAvg > commodityAvg) {
            System.out.println("Stock with Highest Average Price: Equity Stock - " + equityName + " with Average Price: " + equityAvg);
        } else {
            System.out.println("Stock with Highest Average Price: Commodity Stock - " + commodityName + " with Average Price: " + commodityAvg);
        }

        int equityTrendLength = equityStock.findLongestIncreasingTrend()[2];
        int commodityTrendLength = commodityStock.findLongestIncreasingTrend()[2];
        if (equityTrendLength > commodityTrendLength) {
            System.out.println("Stock with Longest Increasing Trend: Equity Stock - " + equityName + " with a trend length of " + equityTrendLength + " days.");
        } else if (commodityTrendLength > equityTrendLength) {
            System.out.println("Stock with Longest Increasing Trend: Commodity Stock - " + commodityName + " with a trend length of " + commodityTrendLength + " days.");
        } else {
            System.out.println("Stock with Longest Increasing Trend: Both " + equityName + " and " + commodityName + " with a trend length of " + equityTrendLength + " days.");

        }
    }
}

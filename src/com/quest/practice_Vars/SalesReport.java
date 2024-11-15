package com.quest.practice_Vars;

public class SalesReport {

    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[][] inventory = {
                {100, 200},
                {50, 150},
                {200, 50},
                {75, 300},
                {150, 100}
        };
        int[] quantitiesSold = {20, 10, 60, 10, 30};

        int restockIndex = 1;
        int restockAmount = 20;
        double minPrice = 100;
        double maxPrice = 300;


        generateSalesReport(products, inventory, quantitiesSold);
        checkInventoryShortages(products, inventory, quantitiesSold);
        restockInventory(products, inventory, restockIndex, restockAmount);
        generateSalesSummary(products, inventory, quantitiesSold, minPrice, maxPrice);
        trackOutOfStockProducts(products, inventory);
    }

    // Task 1: Generate Sales Report
    public static void generateSalesReport(String[] products, int[][] inventory, int[] quantitiesSold) {
        double totalRevenue = 0;
        System.out.println("Task 1: Sales Report:");

        for (int i = 0; i < products.length; i++) {
            int quantitySold = quantitiesSold[i];
            double price = inventory[i][1];
            double revenue = quantitySold * price;
            totalRevenue += revenue;

            System.out.printf("%s sold %d units, Revenue: $%.2f\n", products[i], quantitySold, revenue);
        }
        System.out.printf("Total revenue: $%.2f\n\n", totalRevenue);
    }

        // Task 2: Inventory Shortage Check
        public static void checkInventoryShortages(String[] products, int[][] inventory, int[] quantitiesSold) {
            System.out.println("Task 2: Inventory Shortage Check:");
            for (int i = 0; i < products.length; i++) {
                int quantitySold = quantitiesSold[i];
                int stock = inventory[i][0];
                if (quantitySold > stock) {
                    System.out.printf("Warning: Insufficient stock for %s. Sold %d units, but only %d units were available.\n", products[i], quantitySold, stock);
                } else {
                    // Optional: Print when no shortage occurs (for debugging)
                    System.out.printf("Sufficient stock for %s. Sold %d units, %d units available.\n", products[i], quantitySold, stock);
                }
            }
            System.out.println();
        }

    // Task 3: Restock Inventory
    public static void restockInventory(String[] products, int[][] inventory, int restockIndex, int restockAmount) {
        System.out.println("Task 3: Restock Inventory:");
        System.out.printf("Restocking %s with %d units.\n", products[restockIndex], restockAmount);
        inventory[restockIndex][0] += restockAmount;
        System.out.printf("Updated stock for %s: %d units.\n\n", products[restockIndex], inventory[restockIndex][0]);
    }

    // Task 4: Generate Sales Summary Based on Price Range
    public static void generateSalesSummary(String[] products, int[][] inventory, int[] quantitiesSold, double minPrice, double maxPrice) {
        System.out.println("Task 4: Sales Summary Based on Price Range:");
        System.out.printf("Products in the price range $%.2f to $%.2f:\n", minPrice, maxPrice);
        for (int i = 0; i < products.length; i++) {
            double price = inventory[i][1];
            if (price >= minPrice && price <= maxPrice) {
                int quantitySold = Math.min(quantitiesSold[i], inventory[i][0]);
                double revenue = quantitySold * price;
                System.out.printf("%s: Revenue = $%.2f\n", products[i], revenue);
            }
        }
        System.out.println();
    }

    // Task 5: Track Out-of-Stock Products
    public static void trackOutOfStockProducts(String[] products, int[][] inventory) {
        System.out.println("Task 5: Out-of-Stock Products:");
        boolean hasOutOfStock = false;
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] == 0) {
                System.out.printf("%s is out of stock and unavailable for purchase.\n", products[i]);
                hasOutOfStock = true;
            }
        }
        if (!hasOutOfStock) {
            System.out.println("No products are out of stock.");
        }
    }
}

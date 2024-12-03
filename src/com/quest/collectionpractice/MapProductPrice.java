package com.quest.collectionpractice;
import java.util.HashMap;
import java.util.Map;

public class MapProductPrice {
    public static void main(String[] args) {

                Map<String, Double> productPrices = new HashMap<>();

                productPrices.put("Apple", 1.99);
                productPrices.put("Banana", 0.99);
                productPrices.put("Orange", 2.49);
                productPrices.put("Mango", 1.49);

                System.out.println("Product Prices: " + productPrices);


                productPrices.put("Banana", 1.29);
                System.out.println("Updated Product Prices: " + productPrices);

                String highestPriceProduct = null;
                double highestPrice = -1;
                for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
                    if (entry.getValue() > highestPrice) {
                        highestPrice = entry.getValue();
                        highestPriceProduct = entry.getKey();
                    }
                }

                System.out.println("Product with the highest price: " + highestPriceProduct);
            }
        }




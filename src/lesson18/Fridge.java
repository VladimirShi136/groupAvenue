package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }
    //Вывести от Я до А
    public void printAllProducts() {
        Set<String> keys = new TreeSet<>(Comparator.reverseOrder());
        keys.addAll(products.keySet());
        for (String key : keys) {
            System.out.println(key + " - " + products.get(key));
        }
    }
}

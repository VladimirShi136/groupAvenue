package lesson18HomeWork;

import java.util.*;

public class Fridge {
    private final Map<String, Integer> products = new HashMap<>();

    /**
     * 1. Положить продукт в холодильник
     *
     * @param product - продукт
     * @param weight  - вес
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    /**
     * 2. Взять продукт из холодильника
     *
     * @param productName - название продукта
     */
    public void getProduct(String productName) {
        for (String productFromFridge : products.keySet()) {
            if (productFromFridge.equals(productName)) {
                System.out.println("Берём " + productFromFridge + " весом " + products.get(productFromFridge));
                products.remove(productFromFridge);
                return;
            }
        }
        System.out.println("Продукта " + productName + " нет в холодильнике.");
    }

    /**
     * 3. Вывести вес всех продуктов в холодильнике(сумма)
     */
    public void printWeightAllProducts() {
        int summaWeight = 0;
        for (Integer weightProduct : products.values()) {
            summaWeight += weightProduct;
        }
        System.out.println("Общий вес продуктов = " + summaWeight);
    }

    /**
     * 4. Вывести вес конкретного продукта в холодильнике
     *
     * @param productName - название продукта
     */
    public void printWeightProductByName(String productName) {
        if (products.containsKey(productName)) {
            System.out.printf("Вес продукта под названием %s = %d%n", productName, products.get(productName));
        } else {
            System.out.println("Продукта " + productName + " нет в холодильнике.");
        }
    }

    /**
     * 5. Вывести наименование продукта(продуктов), который закончится первым
     */
    public void printProductLittleWeight() {
        int minimalWeight = Integer.MAX_VALUE;
        for (Integer weightProduct : products.values()) {
            if (weightProduct < minimalWeight) {
                minimalWeight = weightProduct;
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : products.entrySet()) {
            if (stringIntegerEntry.getValue() == minimalWeight) {
                System.out.println(stringIntegerEntry.getKey() + " - название продукта, который закончится первым.");
            }
        }
    }

    /**
     * 6. Вывести наименование продукта(продуктов), которого больше всего
     */
    public void printProductMaxWeight() {
        int maximalWeight = Integer.MIN_VALUE;
        for (Integer weightProduct : products.values()) {
            if (weightProduct > maximalWeight) {
                maximalWeight = weightProduct;
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : products.entrySet()) {
            if (stringIntegerEntry.getValue() == maximalWeight) {
                System.out.println(stringIntegerEntry.getKey() + " - название продукта, которого больше всего.");
            }
        }
    }

    /**
     * 7. Вывести все продукты (название + вес) по алфавиту от Я до А
     */
    public void printAllProductsFromZtoA() {
        Set<String> keys = new TreeSet<>(Comparator.reverseOrder());
        keys.addAll(products.keySet());
        for (String key : keys) {
            System.out.println(key + " - " + products.get(key));
        }
    }

    /**
     * 8. Вывести все продукты (название + вес) по весу от большего к меньшему
     */
    public void printAllProductsWeightMoreToSmaller() {
        Set<Integer> values = new TreeSet<>(Comparator.reverseOrder());
        values.addAll(products.values());
        for (Integer value : values) {
            for (Map.Entry<String, Integer> stringIntegerEntry : products.entrySet()) {
                if (stringIntegerEntry.getValue().equals(value)) {
                    System.out.println(stringIntegerEntry.getKey() + " - " + value);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Список продуктов в холодильнике: " +
                products;
    }
}

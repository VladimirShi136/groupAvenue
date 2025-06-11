package lesson18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Create a new map: гейты и рейсы");
//        Map<Integer, String> gates = new TreeMap<>();
//
//        System.out.println("Добавим элементы");
//
//        gates.put(2, "Москва-Новосибирск");
//        gates.put(4, "Москва-Казань");
//        gates.put(7, "Москва-Севастополь");
//        gates.put(3, "Москва-Владивосток");
//
//        System.out.println("Выводим на экран с помощью map.entrySet()");
//        for (Map.Entry<Integer, String> entry : gates.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        System.out.println();
//
//        System.out.println("Заменим рейс для выхода номер 3");
//        gates.put(3, "Москва-Волгоград");
//        System.out.println("Выводим на экран с помощью map.entrySet()");
//        for (Map.Entry<Integer, String> entry : gates.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//        System.out.println();
//        System.out.println("Выведем значение 3");
//        System.out.println(gates.get(3));
//        System.out.println();
//
//        System.out.println("Проверим есть ли выход номер 5");
//        System.out.println(gates.containsKey(5));
//        System.out.println();
//
//        System.out.println("Удалим выход номер 4");
//        gates.remove(4);
//        System.out.println("Выводим на экран с помощью map.entrySet()");
//        for (Map.Entry<Integer, String> entry : gates.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//
//        System.out.println();
//        System.out.println("Выведем все гейты и значения рейсов с помощью map.keySet()");
//        for (Integer key : gates.keySet()) {
//            System.out.println(key + " - " + gates.get(key));
//        }
//
//        System.out.println();
//        System.out.println("Выведем все гейты и значения рейсов с помощью map.values()");
//        for (String value : gates.values()) {
//            System.out.println(value);
//        }
//
//        System.out.println();
//        System.out.println("Выведем все гейты и значения рейсов");
//        System.out.println(gates);

        Fridge fridge = new Fridge();
        fridge.addProduct("Milk", 5);
        fridge.printAllProducts();
    }
}

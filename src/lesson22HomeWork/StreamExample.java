package lesson22HomeWork;

//a) считает общий доход по всем магазинам сети
//b) считает количество магазинов в сети
//c) считает средний доход на каждый магазин сети
//d) сортирует магазины сети по доходности от большего к меньшему
//e) сортирует магазины сети по соотношению дохода на 1 кв/метр площади магазина
//f) выдает топ 2 лучших и худших магазина по доходу, в процессе расчета выводит каждый магазин в консоль
//g) выдает только магазины, в которых соотношение доход на 1 кв/метр больше 1000 рублей

import java.util.Comparator;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println("Домашняя работа. Урок 22. Stream API");
        List<Shop> shops = new ListShops().getShops(); //Список: сеть магазинов.
        System.out.println("\nСписок всех магазинов:");
        shops.forEach(System.out::println);

        System.out.println("\n1. Посчитаем и выведем общий доход всех магазинов.");
        int sumIncomes = shops
                .stream()
                .mapToInt(Shop::getIncome)
                .sum();
        System.out.println("Общий доход составляет: " + sumIncomes + " р.");

        System.out.println("\n2. Посчитаем и выведем количество всех магазинов.");
        long quantityShops = shops
                .stream()
                .count();
        System.out.println("Количество магазинов: " + quantityShops + " шт.");

        System.out.println("\n3. Посчитаем средний доход магазинов сети:");
        System.out.println("Средний доход составляет: " + sumIncomes / quantityShops + " р.");

        System.out.println("\n4. Отсортируем магазины сети по доходности от большего к меньшему.");
        shops
                .stream()
                .sorted(Comparator.comparing(Shop::getIncome).reversed())
                .forEach(System.out::println);

        System.out.println("\n5. Отсортируем магазины по соотношению дохода на 1 кв/метр площади магазина.");
        shops
                .stream()
                .sorted((o1, o2) -> Integer.compare(o2.getIncome() / o2.getArea(), o1.getIncome() / o1.getArea()))
                .forEach(System.out::println);

        System.out.println("\n6. Выведем в консоль (в процессе расчета) топ 2 лучших и худших магазина по доходу.");
        System.out.println("Топ 2 лучших:");
        shops
                .stream()
                .sorted(Comparator.comparing(Shop::getIncome).reversed())
                .limit(2)
                .forEach(System.out::println);
        System.out.println("Топ 2 худших:");
        shops
                .stream()
                .sorted(Comparator.comparing(Shop::getIncome))
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n7. Выведем магазины, в которых соотношение доход на 1 кв/метр больше 1000 рублей.");
        shops
                .stream()
                .filter(shop -> shop.getIncome() / shop.getArea() > 1000)
                .forEach(System.out::println);
    }
}

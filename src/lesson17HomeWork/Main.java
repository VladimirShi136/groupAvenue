package lesson17HomeWork;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание. 17 урок.\n");
        System.out.println("Задание 1.");
        // 1. Отсортировать монеты по диаметру (от большего к меньшему), году(от
        // меньшего к большему), металлу (по алфавиту от А до Я, от A до Z), по
        // номиналу (от меньшего к большему) в виде отдельного класса компаратора.

        Set<Coin> firstSetCoins = new TreeSet<>(new SortedCoinComparator());

        firstSetCoins.add(new Coin(7, 2010, "Platinum", 10.3));
        firstSetCoins.add(new Coin(5, 1900, "Gold", 10.3));
        firstSetCoins.add(new Coin(5, 1900, "Gold", 11.7));
        firstSetCoins.add(new Coin(9, 1845, "Gold", 12.1));
        firstSetCoins.add(new Coin(5, 2018, "Silver", 8.8));
        firstSetCoins.add(new Coin(8, 2018, "Silver", 8.8));
        firstSetCoins.add(new Coin(10, 2018, "Silver", 8.8));

        System.out.println("Сортируем монеты с помощью отдельного класса компаратора:");
        for (Coin coin : firstSetCoins) {
            System.out.println("По диаметру - " + coin.getDiameter() +
                    ", по году выпуска - " + coin.getYear() +
                    ", по металлу - " + coin.getMetal() +
                    ", по номиналу - " + coin.getNominal());
        }

        System.out.println("\nЗадание 2.");
        // 2. Отсортировать монеты по металлу (по алфавиту от Я до А, от Z до A), по
        // номиналу (от большего к меньшему), по диаметру (от меньшего к
        // большему) в виде анонимного класса-сравнителя.

        Set<Coin> secondSetCoins = new TreeSet<>((o1, o2) -> {
            // по металлу (по алфавиту от Я до А, от Z до A)
            if (!o1.getMetal().equals(o2.getMetal())) return o2.getMetal().compareTo(o1.getMetal());
            // по номиналу от большего к меньшему
            if (o1.getNominal() != o2.getNominal()) return Integer.compare(o2.getNominal(), o1.getNominal());
            // по диаметру от меньшего к большему
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        });

        secondSetCoins.addAll(firstSetCoins);

        System.out.println("Сортируем монеты с помощью анонимного класса-сравнителя:");
        for (Coin coin : secondSetCoins) {
            System.out.println("По металлу - " + coin.getMetal() +
                    ", по номиналу - " + coin.getNominal() +
                    ", по диаметру - " + coin.getDiameter());
        }
    }
}

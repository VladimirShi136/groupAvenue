package lesson15HomeWork;

//1. Объединение двух коллекций с дубликатами
//2. Пересечение двух коллекций с дубликатами
//3. Разность двух коллекций

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CollectionUtilsExampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean answer = true;
//      Создадим объект utils класса CollectionUtilsImpl
        CollectionUtils utils = new CollectionUtilsImpl();
//      Создадим для решения поставленных задач две коллекции: а и b
        do {
            Collection<Integer> a;
            Collection<Integer> b;
//      Заполним коллекции числами с помощью метода fillCollection()
            //System.out.println("Введите числа через пробел для первой коллекции:");
            a = fillCollection();
            //System.out.println("Введите числа через пробел для второй коллекции:");
            b = fillCollection();
//      Проверим работу методов класса CollectionUtilsImpl
            //System.out.println(utils.union(a, b) + " - результат объединения коллекций.");
            //System.out.println(utils.intersection(a, b) + " - результат пересечения коллекций.");
            System.out.println(utils.difference(a, b) + " - результат разницы коллекций.");
            System.out.println("Continue? (true/false)");
            answer = Boolean.parseBoolean(scanner.nextLine());
        } while (answer);
    }

    private static Collection<Integer> fillCollection() {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArray = scanner.nextLine().split(" ");
        Collection<Integer> numbersCollection = new ArrayList<>();
        for (String s : numbersArray) {
            if (Character.isDigit((s.charAt(0)))) {
                try {
                    numbersCollection.add(Integer.valueOf(s));
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Ошибочный формат ввода! Введите числа через пробел!");
                }
            } else {
                throw new NumberFormatException("Некорректный ввод! Введено не число!");
            }
        }
        return numbersCollection;
    }
}

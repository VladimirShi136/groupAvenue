package lesson_2;

//  comments;
/*
    2d commets
 */

public class ClassWork {
    public static void main(String[] args) {

        System.out.println("Задача №1. Есть 3 стороны треугольника, и нужно вывести, " +
                "разносторонний, равносторонний\n" +
                "или равнобедренный учим if и else (если, то). Сторона а = 5 см, б = 7 см, с = 9 см.");

        int a = 5;
        int b = 7;
        int c = 9;

        if (a == b && b == c && a == c) {
            System.out.println("Равносторонний треугольник.");
        } else if (a != b && b != c && a != c) {
            System.out.println("Разносторонний треугольник.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Равнобедренный треугольник");
        }

        System.out.println();

        System.out.println("Задача №2. Вывести в консоль фразу \"Привет Мир!\" - 10 раз");

        for (int i = 0; i < 10; i++) {
            System.out.println("Привет Мир!");
        }

        System.out.println();

        System.out.println("Задача №3. Проверить числа от 30 до 50 на четность.");

        for (int i = 30; i < 51; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        System.out.println("Задача №4.");
        int cash = 10_000_000;

        for (int i = 0; i < 15; i++) {
            cash += (int) (cash  * 0.13);
        }

        System.out.println(cash);
    }
}

package lesson_9_HomeWork;

import java.util.Scanner;

/**
 * Класс для запуска / демонстрации
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Создадим объект прямоугольник и узнаем его площадь");
        System.out.println("Введите длину стороны a и b:");
        Rectangle rectangle = new Rectangle(scanner.nextInt(), scanner.nextInt());
        rectangle.calculateArea();

        System.out.println("Создадим объект треугольник и узнаем его площадь");
        System.out.println("Введите длину стороны a и высоту h:");
        Triangle triangle = new Triangle(scanner.nextInt(), scanner.nextInt());
        triangle.calculateArea();

        System.out.println("Создадим объект круг и узнаем его площадь");
        System.out.println("Введите радиус круга r:");
        Circle circle = new Circle(scanner.nextInt());
        circle.calculateArea();
    }
}

package lesson_5_HomeWork;

//Домашнее задание:
//1. Реализовать по аналогии для фигур 2-5
//2. Использовать методы, которые возвращают значение, чтобы методы отвечали только за 1 функцию (посчитать периметр)

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Добрый день! Я калькулятор периметров фигур");
        String reExecution = "Y";

        while (reExecution.equalsIgnoreCase("Y")) {

            System.out.println("Выберите фигуру, по которой вы хотите посчитать периметр");
            System.out.println("1 - треугольник");
            System.out.println("2 - квадрат");
            System.out.println("3 - круг");
            System.out.println("4 - трапеция");
            System.out.println("5 - овал (эллипс)");

            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.next();  //выбрал next() что бы не было ошибок при вводе букв

            switch (userChoice) {
                case "1" -> {
                    System.out.println("Посчитаем периметр треугольника");
                    System.out.println("Введите длину стороны a:");
                    int a = scanner.nextInt();
                    System.out.println("Введите длину стороны b:");
                    int b = scanner.nextInt();
                    System.out.println("Введите длину стороны c:");
                    int c = scanner.nextInt();

                    int perimeter = MathUtils.calculateTrianglePerimeterAndReturn(a, b, c);
                    System.out.println("Периметр треугольника равен: " + perimeter);

                }
                case "2" -> {
                    System.out.println("Посчитаем периметр квадрата");
                    System.out.println("Так как стороны квадрата равны, введите длину любой стороны:");
                    int lengthSide = scanner.nextInt();

                    int perimeter = MathUtils.calculateSquarePerimeterAndReturn(lengthSide);
                    System.out.println("Периметр квадрата равен: " + perimeter);

                }
                case "3" -> {
                    System.out.println("Посчитаем периметр круга");
                    System.out.println("Введите радиус круга: ");
                    int radius = scanner.nextInt();

                    double perimeter = MathUtils.calculateCirclePerimeterAndReturn(radius);
                    System.out.printf("Периметр круга равен: " + "%.4f", perimeter); //решил округлить до 4 знаков

                    System.out.println();

                }
                case "4" -> {
                    System.out.println("Посчитаем периметр трапеции");
                    System.out.println("Введите длину основания a:");
                    int a = scanner.nextInt();
                    System.out.println("Введите длину боковой стороны b:");
                    int b = scanner.nextInt();
                    System.out.println("Введите длину основания c:");
                    int c = scanner.nextInt();
                    System.out.println("Введите длину боковой стороны d:");
                    int d = scanner.nextInt();

                    int perimeter = MathUtils.calculateTrapeziumPerimeterAndReturn(a, b, c, d);
                    System.out.println("Периметр трапеции равен: " + perimeter);

                }
                case "5" -> {
                    System.out.println("Посчитаем периметр овала (эллипса)");
                    System.out.println("Введите длину большой полуоси a:");
                    int a = scanner.nextInt();
                    System.out.println("Введите длину малой полуоси b:");
                    int b = scanner.nextInt();

                    double perimeter = MathUtils.calculateEllipsePerimeterAndReturn(a, b);
                    System.out.printf("Периметр овала (эллипса) равен: " + "%.4f", perimeter); //округляем до 4 знаков
                    System.out.println();

                }
                default -> System.out.println("Такой функции еще нет.");
            }

            //Дальше идет блок кода для возможности повторения или закрытия программы
            System.out.println("Посчитаем периметр другой фигуры?");
            while (!reExecution.equalsIgnoreCase("N")) {
                System.out.println("Выберите (Y/N)");
                reExecution = scanner.next();
                if (reExecution.equalsIgnoreCase("N")) {
                    System.out.println("Выход из калькулятора");
                    return;
                } else if (reExecution.equalsIgnoreCase("Y")) {
                    break;
                } else {
                    System.out.println("Неверный символ!");
                }
            }
        }
    }
}


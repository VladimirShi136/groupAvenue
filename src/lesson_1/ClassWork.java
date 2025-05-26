package lesson_1;

public class ClassWork {
    public static void main(String[] args) {

        System.out.println("Задача1");
        //Есть три стороны треугольника, посчитай периметр треугольника.
        //Дано:
        int a = 5;
        int b = 7;
        int c = 9;

        //Решение:
        int perimeter = a + b + c;

        //Вывод в консоль:
        System.out.println("Есть три стороны треугольника, посчитай периметр треугольника.");
        System.out.println("Периметр треугольника: " + perimeter);

        System.out.println();

        System.out.println("Задача2");
        //Есть ширина и длина стола, есть ширина и длина комнаты.
        //Сколько столов влезет в комнату

        double widthOfTable = 170.34;
        double lengthOfTable = 110.54;

        double widthOfRoom = 1596.76;
        double lengthOfRoom = 2456.89;

        //Посчитаем площадь стола и комнаты

        double areaOfTable = widthOfTable + lengthOfTable;
        double areaOfRoom = widthOfRoom + lengthOfRoom;

        //Посчитаем кол-во столов
        int quantityOfTable = (int) (areaOfRoom / areaOfTable);

        //Вывод в консоль
        System.out.println("Есть ширина и длина стола, есть ширина и длина комнаты.\n" +
                "Сколько столов влезет в комнату?");
        System.out.println("В комнате поместится: " + quantityOfTable + " столов");
    }
}

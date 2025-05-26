package lesson_11_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeworkSolution {
    public static void main(String[] args) {
        solutionTaskOne();
        System.out.println();
        solutionTaskTwo();
        System.out.println();
        solutionTaskThree();
    }

    static void solutionTaskOne() {
        /*
          Задание 1: Определение типов данных
            Для каждого из приведенных ниже выражений определите,
            к какому типу данных оно относится (примитивному или ссылочному):
         */

        System.out.println("Задание №1");
        int x = 10;
        System.out.println("Переменная \"x\" содержит примитивный целочисленный тип данных \"int\"");

        String str = "Hello";
        System.out.println("Переменная \"str\" содержит ссылку на строковый объект данных \"String/Строка\"");

        boolean isTrue = true;
        System.out.println("Переменная \"isTrue\" содержит примитивный логический тип данных \"boolean\"");

        double d = 3.14;
        System.out.println("Переменная \"d\" содержит примитивный тип данных вещественных чисел \"double\"");

        Integer i = 20;
        System.out.println("Переменная \"i\" содержит ссылку на объект класса-обертки \"Integer\"");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Переменная \"list\" содержит ссылку на объект-список класса \"ArrayList\"");

        char c = 'a';
        System.out.println("Переменная \"c\" содержит примитивный символьный тип данных \"char\"");

        float f = 2.718f;
        System.out.println("Переменная \"f\" содержит примитивный тип данных вещественных чисел \"float\"");
    }

    static void solutionTaskTwo() {
        /*
        Задание 2: Преобразования типов
            Напишите код, который выполняет следующие преобразования:
            Преобразуйте целое число int в строку String.
            Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.
            Преобразуйте вещественное число double в целое число int с потерей дробной части.
            Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием авто-упаковки.
         */

        System.out.println("Задание №2");
        int numberInt = 35;
        double numberDouble = 67.78;
        int numberConverted;
        int[] numbersArray = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> numbersList = new ArrayList<>();

        System.out.println("numberInt = " + numberInt);
        System.out.println("Преобразуем переменную numberInt в String и обратно в int:");
        String stringNumber = String.valueOf(numberInt);
        System.out.println("Преобразуем numberInt в String с помощью метода valueOf() и записываем " +
                "в переменную stringNumber");
        System.out.println("stringNumber = " + stringNumber);
        numberConverted = Integer.parseInt(stringNumber);
        System.out.println("Обратно преобразуем из типа String в тип int с помощью метода parseInt() и " +
                "присваиваем значение переменной numberConverted");
        System.out.println("numberConverted = " + numberConverted);

        System.out.println();
        System.out.println("numberDouble = " + numberDouble);
        System.out.println("Преобразуем переменную numberDouble содержащую число 67.78 в целое число int " +
                "с потерей дробной части:");
        numberConverted = (int) numberDouble;
        System.out.println("Преобразуем double в int с помощью операции приведения примитивных типов ()");
        System.out.println("numberConverted = " + numberConverted);

        System.out.println();
        System.out.println("numbersArray = " + Arrays.toString(numbersArray));
        System.out.println("Преобразуем массив int[] numbersArray в ArrayList-список с помощью авто-упаковки:");
        for (Integer i : numbersArray) {
            numbersList.add(i);
        }
        System.out.println("Авто-упаковка будет происходить в цикле for");
        System.out.println("numbersList = " + numbersList);
    }

    static void solutionTaskThree() {
        /*
        Задание 3: Работа с классами-обёртками
            Создайте программу, которая демонстрирует работу с классами-обёртками.
            Программа должна выполнять следующее:
                -Создать объект класса Integer с помощью конструктора и методом valueOf().
                -Использовать метод equals() для сравнения двух объектов Integer.
                -Применить метод parseInt() для преобразования строки в целое число.
         */

        System.out.println("Задача №3");
        Integer firstNumber = 234;
        System.out.println("Создаем firstNumber - объект класса Integer через конструктор");

        Integer secondNumber = Integer.valueOf(112);
        System.out.println("Создаем secondNumber - объект класса Integer через метод valueOf()");

        boolean resultEquals = firstNumber.equals(secondNumber);
        System.out.println(resultEquals + " - результат сравнения двух объектов методом equals()");

        String thirdNumberString = "789";
        int thirdNumber = Integer.parseInt(thirdNumberString);
        System.out.println(thirdNumber + " - результат преобразования строки thirdNumberString " +
                "в целое число thirdNumber");
    }
}

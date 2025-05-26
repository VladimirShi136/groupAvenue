package lesson_4;

//Домашнее задание
//1) Создать массив 6 на 6 сразу с числами
//2) Перезаписать во все ячейки нули (0)
//3) Вывести диагональ сверху вниз
//4) Вывести в шахматном порядке

import java.util.Arrays;

public class ClassHomeWork {
    public static void main(String[] args) {
        System.out.println("""
                Домашнее задание:
                1) Создать массив 6 на 6 сразу с числами
                2) Перезаписать во все ячейки нули (0)
                3) Вывести диагональ сверху вниз
                4) Вывести в шахматном порядке""");

        System.out.println("\nРешение:");

        //Создаем массив 6 на 6 с числами
        int[][] numbersArray = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        };

        //Перезапишем во все ячейки нули (0)
        for (int[] nestedArray : numbersArray) {
            Arrays.fill(nestedArray, 0);
        }

        //Выведем диагональ сверху вниз
        System.out.println("Диагональ сверху вниз:");
        StringBuilder space = new StringBuilder();
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(space.toString() + numbersArray[i][i]);
            space.append("  ");
        }

        //Выведем в шахматном порядке
        System.out.println("Массив в шахматном порядке:");
        for (int firstIndex = 0; firstIndex < numbersArray.length; firstIndex++) {
            for (int secondIndex = 0; secondIndex < numbersArray[firstIndex].length; secondIndex++) {
                if (firstIndex % 2 == 0) { //отберем четные элементы массива
                    if (secondIndex % 2 == 0) {
                        System.out.print(numbersArray[firstIndex][secondIndex]);
                    } else {
                        System.out.print("  ");
                    }
                } else { //отберем нечетные элементы массива
                    if (secondIndex % 2 != 0) {
                        System.out.print(numbersArray[firstIndex][secondIndex]);
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}


package lesson_4;

public class ClassWork {
    public static void main(String[] args) {
        //Сделаем пустой массив для 10 элементов
        int[] array = new int[10];


        //Выведем в консоль все элементы массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Заполняем массив данными от 1 до 10
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("\nЗадача 1.");

        int[] arrayNumbers = {4, 67, 3, 4, 45, 6, 7, 8, 9, 10};
        System.out.println(45 % 10);

    }
}

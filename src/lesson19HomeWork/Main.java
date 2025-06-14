package lesson19HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {
        Scanner scanner = new Scanner(System.in);
        StringUtilsImpl stringUtils = new StringUtilsImpl();

        System.out.println("Домашнее задание 19 урок ->");
        System.out.println("\n1. Вводим два числа для метода \"div\"");
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
//        String num1 = null;
//        String num2 = null;

//        String num1 = "34";
//        String num2 = "6";
        System.out.println("Результат деления числа \"" + num1 + "\" на \"" + num2 + "\": " + stringUtils.div(num1, num2));

        System.out.println("\n2. Вводим текст и слово для метода \"findWord\"");
        String textFindWord = scanner.nextLine();
        String word = scanner.nextLine();
//        String textFindWord = null;
//        String word = null;

//        String textFindWord = "В маленьком городе жил Алекс. Алекс мечтал о приключениях. " +
//                "Каждое утро он исследовал улицы и искал вдохновение. Алекс хотел написать книгу о своих путешествиях.";
//        String word = "Алекс";
        System.out.printf("Массив индексов слова \"%s\": %s%n", word,
                Arrays.toString(stringUtils.findWord(textFindWord.toLowerCase(), word.toLowerCase())));

        System.out.println("\n3. Вводим текст для метода \"findNumbers\"");
        String textFindNums = scanner.nextLine();
//        String textFindNums = "Числа: 3.14, 2.71, и 42.0.";
//        String textFindNums = "Пример строки с числами и текст.";
        System.out.println("Массив чисел: " + Arrays.toString(stringUtils.findNumbers(textFindNums)));
    }
}

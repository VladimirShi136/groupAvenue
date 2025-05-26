package lesson_8;

//общение с пользователем

import java.util.Scanner;

public class CheapTripController {
    public static void start () {
        System.out.println("Добрый день. Я ваш персональный ГИД.");
        System.out.println("Выберите фильтр по поиску туров:" +
                "1. По стране 2. По цене");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Выберете страну");
                String country = scanner.nextLine();
                //todo вызов базы данных для поиска по стране
                break;
            case 2:
                System.out.println("Выберите бюджет");
                int price = scanner.nextInt();
                //todo вызов базы данных для поиска по цене
                break;
            default:
                System.out.println("Функции нет");

        }
    }
}

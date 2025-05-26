package lesson_8_HomeWork;

import java.util.Scanner;

/**
 * Класс контроллер
 */
public class CheapTripController {
    private final CheapTripDB cheapTripDB = new CheapTripDB();

    /**
     * Запуск общения с пользователем
     */
    public void start() {
        System.out.println("Добрый день! Я ваш персональный ГИД.");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите фильтр, по которому вы хотите искать туры.");
            System.out.println("1 - Поиск туров по стране.");
            System.out.println("2 - Поиск туров по цене.");
            System.out.println("3 - Поиск туров по городу.");
            System.out.println("4 - Поиск туров по цене и по звездам одновременно.");
            System.out.println("5 - Просмотр всех туров.");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        System.out.println("Введите страну, куда вы хотите поехать:");
                        String country = scanner.nextLine();
                        cheapTripDB.searchByCountry(country);
                    }
                    case 2 -> {
                        System.out.println("Введите ваш бюджет:");
                        int price = Integer.parseInt(scanner.nextLine());
                        cheapTripDB.searchByPrice(price);
                    }
                    case 3 -> {
                        System.out.println("Введите название города, в который хотите поехать:");
                        String city = scanner.nextLine();
                        cheapTripDB.searchByCity(city);
                    }
                    case 4 -> {
                        System.out.println("Введите ваш бюджет:");
                        int price = Integer.parseInt(scanner.nextLine());
                        System.out.println("Введите желаемое количество звезд у отеля:");
                        int stars = Integer.parseInt(scanner.nextLine());
                        cheapTripDB.searchByPriceAndStars(price, stars);
                    }
                    case 5 -> {
                        System.out.println("Список всех туров:");
                        cheapTripDB.printListAllTours();
                    }
                    default -> System.out.println("Такой функции еще нет, выберите функцию из списка.");
                }
            } catch (Exception e) {
                System.out.println("Некорректный ввод!!!");
            }

            // Вариант выбора другого поиска или завершения работы ГИДА
            while (true) {
                System.out.println("Выполнить другой поиск? (ДА / НЕТ)");
                String anotherSearch = scanner.nextLine();

                if (anotherSearch.equalsIgnoreCase("НЕТ")) {
                    System.out.println("Завершение работы ГИДА");
                    return;
                } else if (anotherSearch.equalsIgnoreCase("ДА")) {
                    break;
                } else {
                    System.out.println("ДА или НЕТ!");
                }
            }
        }
    }
}

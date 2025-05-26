package lesson_8_HomeWork;

/**
 * Класс для работы с базой данных
 */
public class CheapTripDB {

    private static final String NOTHING_FOUND = "Туров по заданному фильтру не найдено.";
    private final Tour[] tours = new Tour[100];


    public CheapTripDB() {
        addTour("Турция", "Стамбул", "Самолет", 100_000, 5, 3, "завтрак");
        addTour("Турция", "Анталья", "Самолет", 150_000, 7, 5, "завтрак");
        addTour("Италия", "Рим", "Автобус", 150_000, 10, 4, "все включено");
        addTour("Турция", "Самсун", "Паром", 70000, 5, 2, "завтрак + обед");
        addTour("Германия", "Берлин", "Автобус", 135_000, 9, 4, "все включено");
        addTour("Россия", "Алтай", "Поезд", 78000, 4, 5, "завтрак");
        addTour("Иран", "Шираз", "Самолет", 80000, 5, 4, "завтрак");
        addTour("Шри-ланка", "Коломбо", "Самолет", 200_000, 10, 5, "все включено");
    }

    /**
     * Поиск туров по стране
     *
     * @param country страна
     */
    public void searchByCountry(String country) {
        int count = 0;
        for (Tour tour : tours) {
            if (tour != null) {
                if (tour.getCountry().equalsIgnoreCase(country)) {
                    count++;
                    System.out.println(tour);
                }
            } else {
                break;
            }
        }
        if (count == 0) {
            System.out.println(NOTHING_FOUND);
        }
    }

    /**
     * Поиск туров по цене
     *
     * @param price цена
     */
    public void searchByPrice(int price) {
        int count = 0;
        for (Tour tour : tours) {
            if (tour != null) {
                if (tour.getPrice() <= price) {
                    count++;
                    System.out.println(tour);
                }
            } else {
                break;
            }
        }
        if (count == 0) {
            System.out.println(NOTHING_FOUND);
        }
    }

    /**
     * Поиск туров по городам
     *
     * @param city город
     */
    public void searchByCity(String city) {
        int count = 0;
        for (Tour tour : tours) {
            if (tour != null) {
                if (tour.getCity().equalsIgnoreCase(city)) {
                    count++;
                    System.out.println(tour);
                }
            } else {
                break;
            }
        }
        if (count == 0) {
            System.out.println(NOTHING_FOUND);
        }
    }

    /**
     * Поиск туров по цене и звездам одновременно
     *
     * @param price цена
     * @param stars звезды
     */
    public void searchByPriceAndStars(int price, int stars) {
        int count = 0;
        for (Tour tour : tours) {
            if (tour != null) {
                if (tour.getPrice() <= price && tour.getStars() == stars) {
                    count++;
                    System.out.println(tour);
                }
            } else {
                break;
            }
        }
        if (count == 0) {
            System.out.println(NOTHING_FOUND);
        }
    }

    /**
     * Просмотр списка всех туров
     */
    public void printListAllTours() {
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            } else {
                System.out.println(tour);
            }
        }
    }

    /**
     * Добавление тура в базу данных
     *
     * @param country   страна
     * @param city      город
     * @param transport транспорт
     * @param price     цена
     * @param days      дни
     * @param stars     звезды
     * @param food      питание
     */
    private void addTour(String country, String city, String transport, int price, int days, int stars, String food) {
        for (int index = 0; index < tours.length; index++) {
            if (tours[index] == null) {
                Tour tour = new Tour(country, city, transport, price, days, stars, food);
                tours[index] = tour;
                return;
            }
        }
    }
}


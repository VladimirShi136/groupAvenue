package lesson_1;

public class ClassHomeWork {
    public static void main(String[] args) {

        //У нас есть 1000 рублей. Мы идем в магазин.
        // Нам нужно купить по максимуму сникерсов,
        // и на сдачу купить конфет. Сникерс стоит 35 руб. Конфета - 3,5 руб.
        //Вывести на консоль сколько мы купим сникерсов?
        //Сколько конфет? И сколько останется сдачи?

        System.out.println("Задача3");

        //Дано:
        int totalMoney = 1000;
        int oneSnickers = 35;
        double oneCandy = 3.5;

        //Решение:
        int quantitySnickers = totalMoney / oneSnickers;
        System.out.println("Количество купленных сникерсов: " + quantitySnickers);

        int theRestOfMoney = totalMoney % oneSnickers; //Остаток денег после покупки сникерсов.

        int quantityCandy = (int) (theRestOfMoney / oneCandy);
        System.out.println("Количество купленных конфет: " + quantityCandy);

        double change = theRestOfMoney % oneCandy;
        System.out.println("Остаток денег: " + change);
    }
}

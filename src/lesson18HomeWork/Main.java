package lesson18HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание: Холодильник.\n");

        Fridge fridge = new Fridge(); // Создадим объект fridge класса Fridge.

        System.out.println("Запустим существующие методы класса Fridge>>>");
        System.out.println("1. Добавим продукты с помощью addProduct:");
        fridge.addProduct("Молоко", 5);
        fridge.addProduct("Хлеб", 2);
        fridge.addProduct("Сыр", 2);
        fridge.addProduct("Колбаса", 7);
        fridge.addProduct("Апельсин", 16);
        fridge.addProduct("Помидор", 10);
        fridge.addProduct("Огурец", 8);
        System.out.println(fridge);

        System.out.println("\n2. Возьмем продукт из холодильника с помощью getProduct:");
        fridge.getProduct("Банан");
        fridge.getProduct("Помидор");
        System.out.println(fridge); // Помидор отсутствует в холодильнике, так как мы его взяли оттуда.

        System.out.println("\n3. Выведем общий вес всех продуктов в холодильнике:");
        fridge.printWeightAllProducts();

        System.out.println("\n4. Выведем вес конкретного продукта в холодильнике:");
        fridge.printWeightProductByName("Яблоко");
        fridge.printWeightProductByName("Капуста");
        fridge.printWeightProductByName("Сыр");

        System.out.println("\n5. Выведем название продукта (продуктов), который закончится первым:");
        fridge.printProductLittleWeight();

        System.out.println("\n6. Выведем название продукта (продуктов), которого больше всего в холодильнике:");
        fridge.printProductMaxWeight();

        System.out.println("\n7. Выведем все продукты (название + вес) по алфавиту от Я до А:");
        fridge.printAllProductsFromZtoA();

        System.out.println("\n8. Выведем все продукты (название + вес) по весу от большего к меньшему:");
        fridge.printAllProductsWeightMoreToSmaller();
    }
}

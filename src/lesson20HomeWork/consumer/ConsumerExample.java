package lesson20HomeWork.consumer;

import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Список чисел : " + numbersList);
        System.out.println("\nВыведем только чётные числа,умноженные на 2. / отдельный класс");
        numbersList
                .forEach(new ConsumerClass());

        System.out.println("\nВыведем только нечетные числа, умноженные на 3.");
        numbersList
                .stream()
                .peek(number -> {
                    if (number % 2 != 0) {
                        System.out.println(number * 3);
                    }
                })
                .toList();
    }
}

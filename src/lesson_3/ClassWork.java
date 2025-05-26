package lesson_3;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("Задача1");
        for (int number = 0; number < 10; number++) {
            if (number == 2) {
                continue;
            }

            if (number == 5) {
                continue;
            }

            System.out.println(number);
        }

        System.out.println("\nЗадача2");
        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод первого цикла");
            System.out.println(index);
        }

        for (int index = 0; index < 10; index++) {
            if (index == 6) {
                break;
            }
            System.out.println("Вывод второго цикла");
            System.out.println(index);
        }

        System.out.println("Задача3");
        double[] emptyArray = new double[8];
        emptyArray[0] = 1.54;
        emptyArray[4] = 1.67;
        emptyArray[7] = 3.56;
        emptyArray[7] = 2.56;
        System.out.println(emptyArray[2]);
        System.out.println();
        System.out.println("Задача4");
        int[] numbers = {1, 2, 65, 4, 32, 34, 5, 87, 8, 5};
        for (int index = numbers.length - 1; index >= 0; index--) {
            if (numbers[index] % 2 == 0) {
                System.out.println(numbers[index]);
            }
        }

        System.out.println();
        System.out.println("Задача5");

        char[] symbolsWithWord = {'П', 'А', 'Р', 'А', 'Л', 'Е', 'Л', 'О', 'Г', 'Р', 'А', 'М',};
        String word = "";
        for (int i = 0; i < symbolsWithWord.length; i++) {
            word += symbolsWithWord[i];
        }
        System.out.println(word);
    }
}

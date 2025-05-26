//Задача
//
//Напишите метод sortEvenOdd, который принимает целочисленный массив и сортирует его таким образом, чтобы сначала шли чётные числа в порядке возрастания, а потом нечётные — также в порядке возрастания.
//
//Пример:
//Input: arr = {3, 1, 4, 1, 5, 9, 2}
//Output: {2, 4, 1, 1, 3, 5, 9}
//
//Подсказка:
//- Сначала отделите четные элементы от нечетных.
//- Затем отсортируйте каждую группу отдельно.
//- Объедините две группы обратно в один массив.

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNums = createArrayOfNumbers(scanner.nextLine().trim());
        int[] resultArr = sortEvenOdd(arrNums);
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] sortEvenOdd(int[] arrNums) {
        String even = "";
        String notEven = "";
        for (int num : arrNums) {
            if (num % 2 == 0) {
                even += num + ", ";
            } else {
                notEven += num + ", ";
            }
        }

        int[] evenArray = createArrayOfNumbers(even);
        Arrays.sort(evenArray);
        int[] notEvenArray = createArrayOfNumbers(notEven);
        Arrays.sort(notEvenArray);

        int[] resultArray = new int[arrNums.length];
        System.arraycopy(evenArray, 0, resultArray, 0, evenArray.length);
        System.arraycopy(notEvenArray, 0, resultArray, evenArray.length, notEvenArray.length);
        return resultArray;
    }

    public static int[] createArrayOfNumbers(String numbers) {
        String[] arrayStr = numbers.split(", ");
        int[] arrNums = new int[arrayStr.length];

        for (int index = 0; index < arrayStr.length; index++) {
            arrNums[index] = Integer.parseInt(arrayStr[index]);
        }

        return arrNums;
    }

}
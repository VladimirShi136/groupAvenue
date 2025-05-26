package lesson_2;

//Домашнее задание
//Вы хотите разместить вклад в банке на сумму 1 миллион 200 тысяч рублей
//Срок вклада 1 год
//Вам предложено 2 варианта
//Вариант 1 - с ежемесячной капитализацией по ставке 22%
//Вариант 2 - с начислением процентов в конце срока по ставке 22,5%
//1) Определить, какая сумма у вас накопится к концу сроку вклада по обоим вариантам
//2) Выбрать наиболее выгодный
//3) Вывести результаты в консоль

public class ClassHomeWork {
    public static void main(String[] args) {
        System.out.println("""
                Домашнее задание.
                Вы хотите разместить вклад в банке на сумму 1 миллион 200 тысяч рублей.
                Срок вклада 1 год.
                Вам предложено 2 варианта:
                * Вариант 1 - с ежемесячной капитализацией по ставке 22%
                * Вариант 2 - с начислением процентов в конце срока по ставке 22,5%
                1) Определить, какая сумма у вас накопится к концу сроку вклада по обоим вариантам
                2) Выбрать наиболее выгодный
                3) Вывести результаты в консоль
                """);

        int depositAmount = 1_200_000; // сумма на вкладе
        int depositTerm = 12; // срок вклада
        double depositMonthlyRate = 0.22; // % ставка при ежемесячной капитализации
        double finalTermDepositRate = 0.225; // ставка при выплате процентов в конце срока

        System.out.println("Решение:");

        // Переменная для хранения суммы вклада после ежемесячной капитализации (S = Р * (1 + (N/100)/12)^n), где -
        // S - сумма на депозите в конце срока вклада;
        // Р - начальная сумма на депозите;
        // N - % ставка;
        // n – количество месяцев вклада;
        int totalAmountWithMonthlyCapitalization = (int) (depositAmount *
                Math.pow(1 + depositMonthlyRate / depositTerm, depositTerm));

        // Переменная для хранения суммы вклада после начисления процентов в конце срока
        int totalAmountAtMaturity = (int) (depositAmount * finalTermDepositRate) + depositAmount;

        //Вывод в консоли сумм по двум вариантам в конце срока вклада
        System.out.println("Итоговая сумма после ежемесячной капитализации - " +
                totalAmountWithMonthlyCapitalization + "р.");
        System.out.println("Итоговая сумма после выплаты процентов в конце года - " + totalAmountAtMaturity + "р.");

        //Выбор наиболее выгодного варианта и вывод в консоли
        if (totalAmountWithMonthlyCapitalization > totalAmountAtMaturity) {
            System.out.println("Более выгодным в данном случае является Вариант 1: с ежемесячной капитализацией.");
        } else if (totalAmountWithMonthlyCapitalization < totalAmountAtMaturity) {
            System.out.println("Более выгодным в данном случае является Вариант 2: с начислением % в конце года.");
        } else if (totalAmountWithMonthlyCapitalization == totalAmountAtMaturity) {
            System.out.println("Оба варианта являются выгодными.");
        }
    }
}

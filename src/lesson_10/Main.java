package lesson_10;

import java.util.Scanner;

//запуск игры
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в BlackJack!");
        System.out.println("Введите количество игроков:");
        new BlackJack().start(new Scanner(System.in).nextInt());
    }
}

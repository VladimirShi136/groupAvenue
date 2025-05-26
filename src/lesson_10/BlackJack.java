package lesson_10;

// Игра Блекджек - здесь взаимодействие объектов
//1. создать игроков - готово
//2. раздать карты
//3. раздаем пока берут игроки
//4. печатаем у кого сколько очков
//5. печатаем победителя

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    private ArrayList<Player> players = new ArrayList<>(); // список игроков
    private Dealer dealer = new Dealer();// дилер
    private Deck deck = new Deck();

    public void start(int playersQuantity) {
        if (playersQuantity < 1) {
            System.out.println("Минимальное количество игроков - 1");
            return;
        }
        if (playersQuantity > 5) {
            System.out.println("Максимальное количество игроков - 5");
            return;
        }
        //создание игроков
        createPlayers(playersQuantity);
        //раздаем карты
        dealTwoCardsToPlayers();
        //метод раздать остальные карты
        dealRestCardsToPlayers();
        //печатаем у кого сколько очков
        printPlayersTotalNominal();
        //определим победителя
        printWinner();
    }




    private void createPlayers(int playersQuantity) {
        players.add(dealer);
        for (int playerNumber = 0; playerNumber < playersQuantity; playerNumber++) {
            System.out.println("Введите имя игрока " + (playerNumber + 1) + ":");
            String name = new Scanner(System.in).nextLine();
            Player player = new Player(name);
            players.add(player);
            System.out.println("Игрок " + name + " создан");
        }
    }

    private void dealTwoCardsToPlayers() {
        for (Player player : players) {
            Card card1 = deck.getRandomCard();
            Card card2 = deck.getRandomCard();
            player.getHand(card1);
            player.getHand(card2);
        }
    }

    private void dealRestCardsToPlayers() {
        for (Player player : players) {
            while (player.doYouNeedMoreCard()) {
                player.getHand(deck.getRandomCard());
            }
        }
    }

    private void printPlayersTotalNominal() {
        for (Player player : players) {
            int sum = player.getSum();
            System.out.println(player.getName() + " имеет очков " + sum);
        }
    }

    private void printWinner() {
        Player winner = players.get(0);
        for (Player player : players) {
            if (player.getSum() > winner.getSum() && player.getSum() <= 21) {
                winner = player;
            }
        }
        System.out.println("Победитель - " + winner.getName());
    }
}

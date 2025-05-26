package lesson_10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void getHand(Card card) {
        hand.add(card);
    }

    public boolean doYouNeedMoreCard() {
        if (!isCanWin()){
            System.out.println("Игрок" + name + "достиг очков" + getSum());
            return false;
        }

        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println("Игрок " + name + " хотите еще карту? (да/нет)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да") || answer.equalsIgnoreCase("yes")) {
            return true;
        }

        return false;
    }

    public int getSum () {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getNominal();
        }
        return sum;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hand);
    }

    @Override
    public String toString() {
        return "Игрок по имени " + name;
    }

    private boolean isCanWin () {
        return getSum() <= 21;
    }

}

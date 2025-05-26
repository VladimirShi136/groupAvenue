package lesson_10;

public class Dealer extends Player {
    public Dealer() {
        super("Дилер");
    }

    @Override
    public boolean doYouNeedMoreCard() {
        return getSum() < 17;
    }
}

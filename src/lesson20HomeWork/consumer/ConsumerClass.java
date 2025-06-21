package lesson20HomeWork.consumer;

import java.util.function.Consumer;

public class ConsumerClass implements Consumer<Integer> {
    @Override
    public void accept(Integer number) {
        if (number % 2 == 0) {
            System.out.println(number * 2);
        }
    }
}

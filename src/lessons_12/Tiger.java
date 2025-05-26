package lessons_12;

public class Tiger extends Animal {

    public Tiger(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println("Бегу вперёд");
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю на песке");
    }
}

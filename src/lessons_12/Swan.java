package lessons_12;

public class Swan extends Animal {


    public Swan(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println("Лечу на юг");
    }

    @Override
    public void eat() {
        System.out.println("Ем рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю на берегу");
    }
}

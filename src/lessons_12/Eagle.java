package lessons_12;

public class Eagle extends Animal{


    public Eagle(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println("Лечу в воздухе");
    }

    @Override
    public void eat() {
        System.out.println("Ем мышь");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю на берегу");
    }
}

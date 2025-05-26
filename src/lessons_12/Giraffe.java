package lessons_12;

public class Giraffe extends Animal {


    public Giraffe(String name, int age, String food, String color) {
        super(name, age, food, color);
    }

    @Override
    public void move() {
        System.out.println("Хожу медленно");
    }

    @Override
    public void eat() {
        System.out.println("Ем траву");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю долго");
    }
}

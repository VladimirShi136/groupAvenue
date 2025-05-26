package lesson12Home;

public class PlushDuck extends Duck implements Speakable {

    public PlushDuck(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void swim() {
        System.out.println("Плюшевая утка " + getName() + " плавает как настоящая.");
    }

    @Override
    public void speak() {
        System.out.println("Плюшевая утка " + getName() + " не плохо крякает.");
    }
}

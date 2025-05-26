package lesson12Home;

public class RubberDuck extends Duck {

    public RubberDuck(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void swim() {
        System.out.println("Резиновая утка " + getName() + " плавает в ванной.");
    }

}

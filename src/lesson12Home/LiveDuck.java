package lesson12Home;

public class LiveDuck extends Duck implements Flyable, Speakable {

    public LiveDuck(String name, String color, int weight) {
        super(name, color, weight);
    }

    public void reproduce() {
        System.out.println("Живая утка " + getName() + " способна к размножению.");
    }

    @Override
    public void swim() {
        System.out.println("Живая утка " + getName() + " хорошо плавает.");
    }

    @Override
    public void fly() {
        System.out.println("Живая утка " + getName() + " умеет летать.");
    }

    @Override
    public void speak() {
        System.out.println("Живая утка " + getName() + " по настоящему крякает.");
    }
}


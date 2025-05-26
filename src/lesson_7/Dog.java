package lesson_7;

public class Dog {
    private String name;
    private String color;
    private int age;
    private int weight;

    public Dog(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void toVoice() {
        System.out.println("Гав-Гав!");
    }

    public void sayName() {
        System.out.println("Меня зовут " + name);
    }
}

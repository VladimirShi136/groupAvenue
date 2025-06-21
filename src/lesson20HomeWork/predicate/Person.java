package lesson20HomeWork.predicate;

public class Person {
    private final String name;
    private final int age;
    private final int weight;

    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Человек по имени " + name + " имеет возраст " + age + " и весит " + weight + " кг";
    }
}

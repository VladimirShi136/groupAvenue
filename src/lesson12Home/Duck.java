package lesson12Home;

import java.util.Objects;

public abstract class Duck {
    private String name;
    private String color;
    private int weight;

    public Duck(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract void swim();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return weight == duck.weight && name.equals(duck.name) && color.equals(duck.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight);
    }

    @Override
    public String toString() {
        return "Duck = { " + name + " | " + color + " | " +
                weight + " }";
    }
}

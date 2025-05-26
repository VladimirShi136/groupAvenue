package lesson_7_HomeWork;

import java.util.Objects;

public class Cat {
    private final String name;
    private int height;
    private int weight;
    private final String color;
    private final int numberOfPaws;
    private String favoriteFood;

    public Cat(String name, int height, int weight, String color, int numberOfPaws, String favoriteFood) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.favoriteFood = favoriteFood;
    }

    public static void tellAboutData(Cat cat) {
        System.out.println("Меня зовут " + cat.getName() + ", мой рост составляет " + cat.getHeight() +
                " см, а вес " + cat.getWeight() + " кг.");
        System.out.println("У меня есть " + cat.getNumberOfPaws() + " лапки, а моя шерсть имеет " +
                cat.getColor() + " цвет. Моя любимая еда это " + cat.getFavoriteFood() + ".");
    }

    public static void changeAndPrintNewData(Cat cat, int height, int weight, String favoriteFood) {
        cat.setHeight(height);
        cat.setWeight(weight);
        cat.setFavoriteFood(favoriteFood);
        System.out.println("Теперь у кота по имени " + cat.getName() + " рост - " + cat.getHeight() +
                " см, вес - " + cat.getWeight() + " кг, любимая еда - " + cat.getFavoriteFood());
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", favoriteFood='" + favoriteFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return height == cat.height && weight == cat.weight && numberOfPaws == cat.numberOfPaws &&
                Objects.equals(name, cat.name) && Objects.equals(color, cat.color) &&
                Objects.equals(favoriteFood, cat.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, color, numberOfPaws, favoriteFood);
    }
}

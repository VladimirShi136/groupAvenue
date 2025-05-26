package lessons_12;

// Создадим животных
// Орел
// Слон
// Жираф
// Тигр
// Лебедь
// --- Есть ли у животных какие-то общие поля состояния? ---
// Возраст
// Имя
// Еда
// Цвет
// --- Есть ли общее поведение? ---
// двигаются
// едят
// спят
//Есть ли индивидуальное поведение?
//Орел, лебедь - летают
//Тигр, Орел - охотятся
//Лебедь - плавает

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String food;
    private String color;

    public Animal(String name, int age, String food, String color) {
        this.name = name;
        this.color = color;
        this.food = food;
        this.age = age;
    }

    public abstract void move();
    public abstract void eat();
    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(food, animal.food) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, food, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

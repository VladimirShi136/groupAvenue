package lesson_9_HomeWork;

/**
 * Класс - наследник: Прямоугольник
 */

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    void calculateArea() {   //Площадь прямоугольника: S = a * b
        System.out.println("Площадь прямоугольника равна: " + a * b);
    }
}

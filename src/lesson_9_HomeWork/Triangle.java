package lesson_9_HomeWork;

/**
 * Класс - наследник: Треугольник
 */

public class Triangle extends Shape {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    void calculateArea() {  //Площадь треугольника: S = (a * h) / 2
        System.out.println("Площадь треугольника равна: " + (a * h) / 2);
    }
}

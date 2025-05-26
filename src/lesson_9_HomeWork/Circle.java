package lesson_9_HomeWork;


/**
 * Класс - наследник: Круг
 */

public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    void calculateArea() {    // Площадь круга: S = π * r^2
        System.out.println("Площадь круга равна: " + Math.floor(Math.PI * Math.pow(r, 2)));
    }
}

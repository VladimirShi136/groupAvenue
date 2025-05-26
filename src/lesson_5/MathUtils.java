package lesson_5;

/**
 *
 */

public class MathUtils {
    // Метод посчитает периметр треугольника по трем сторонам.
    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public static double calculateArea(double sideA, double sideB, double sideC) {
        double p = calculatePerimeter(sideA, sideB, sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

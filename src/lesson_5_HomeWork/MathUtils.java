package lesson_5_HomeWork;

public class MathUtils {
    public static int calculateTrianglePerimeterAndReturn(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateSquarePerimeterAndReturn(int lengthSide) {
        return 4 * lengthSide;
    }

    public static double calculateCirclePerimeterAndReturn(int radius) {
        return 2 * Math.PI * radius;
    }

    public static int calculateTrapeziumPerimeterAndReturn(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static double calculateEllipsePerimeterAndReturn(double a, double b) {
        return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 8);
    }
}


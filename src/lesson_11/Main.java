package lesson_11;

public class Main {
    public static void main(String[] args) {
        String numText = "7.5";
        double numDouble = Double.parseDouble(numText);
        // привести double к int
        int numInt = (int) numDouble;
        System.out.println(numInt);

    }
}

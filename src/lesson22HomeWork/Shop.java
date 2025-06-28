package lesson22HomeWork;

public class Shop {
    private final String name;
    private final int income;
    private final int area;

    public Shop(String name, int income, int area) {
        this.name = name;
        this.income = income;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", area=" + area +
                '}';
    }
}

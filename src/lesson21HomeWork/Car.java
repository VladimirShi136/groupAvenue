package lesson21HomeWork;

import java.util.List;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final int price;

    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль марки " + brand + " модель " + model + " выпущен в " + year + " году. Цена: " + price;
    }
}

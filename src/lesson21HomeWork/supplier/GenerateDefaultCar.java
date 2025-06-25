package lesson21HomeWork.supplier;

import lesson21HomeWork.Car;

import java.util.function.Supplier;

public class GenerateDefaultCar implements Supplier<Car> {
    /**
     * Метод для создания объекта Car по умолчанию.
     * @return - новый объект Car по умолчанию.
     */
    @Override
    public Car get() {
        return new Car("Auto", "Model", 0, 0);
    }
}

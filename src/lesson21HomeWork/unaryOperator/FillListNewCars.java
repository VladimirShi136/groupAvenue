package lesson21HomeWork.unaryOperator;

import lesson21HomeWork.Car;

import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class FillListNewCars implements UnaryOperator<List<Car>> {
    @Override
    public List<Car> apply(List<Car> cars) {
        cars.clear();
        Collections.addAll(cars,
                new Car("BMW", "X1", 2018, 2_500_600),
                new Car("Audi", "A3", 2016, 3_400_500),
                new Car("Mercedes", "E200", 2015, 4_000_220),
                new Car("Opel", "Astra", 2014, 1_800_700));
        return cars;
    }
}

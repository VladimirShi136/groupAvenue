package lesson21HomeWork.unaryOperator;

import lesson21HomeWork.Car;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public List<Car> fillListNewCars (List<Car> cars) {
        //Заполним список настоящими автомобилями
        FillListNewCars fillListNewCars = new FillListNewCars();
        List<Car> newListCars = fillListNewCars.apply(cars);

        //Добавим в новый список еще несколько объектов-автомобилей с помощью анонимного класса
        UnaryOperator<List<Car>> addNewsCars = cars1 -> {
            cars1.add(new Car("Nissan", "Leaf", 2018, 1_000_000));
            cars1.add(new Car("Honda", "Civic", 2017, 2_000_000));
            cars1.add(new Car("Honda", "Accord", 2016, 3_000_000));
            return cars1;
        };

        List<Car> result = addNewsCars.apply(newListCars);
        result.forEach(System.out::println);
        return result;
    }
}

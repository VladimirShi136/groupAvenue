package lesson21HomeWork.supplier;

import lesson21HomeWork.Car;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public void generateLengthListAndDefaultCars(List<Car> cars) {
        //Сгенерируем начальное количество объектов в списке через анонимный класс
        var lengthArray = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(4) + 1;
            }
        };

        //Добавим в список объекты по умолчанию через отдельный класс
        GenerateDefaultCar generateDefaultCar = new GenerateDefaultCar();
        for (int index = 0; index < lengthArray.get(); index++) {
            cars.add(generateDefaultCar.get());
        }
        cars.forEach(System.out::println);
    }
}

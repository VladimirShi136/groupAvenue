package lesson21HomeWork.function;

import lesson21HomeWork.Car;

import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public void printServiceListAndPriceCars(List<Car> cars) {
        //Выведем список сервисного обслуживания автомобилей через отдельный класс
        CreateServiceList createServiceList = new CreateServiceList();
        List<String> serviceList = createServiceList.apply(cars);
        serviceList.forEach(System.out::println);

        //Выведем стоимость всех автомобилей через анонимный класс
        var priceCars = new Function<List<Car>, Integer>() {
            @Override
            public Integer apply(List<Car> cars) {
                return cars
                        .stream()
                        .mapToInt(Car::getPrice)
                        .sum();
            }
        };

        System.out.println("\nСтоимость всех автомобилей: " + priceCars.apply(cars));
    }
}

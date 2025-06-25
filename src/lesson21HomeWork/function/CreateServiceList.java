package lesson21HomeWork.function;

import lesson21HomeWork.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class CreateServiceList implements Function<List<Car>, List<String>> {

    @Override
    public List<String> apply(List<Car> cars) {
        List<String> serviceList = new ArrayList<>();
        for (Car car : cars) {
            serviceList.add("Автомобиль %s %s должен быть обслужен в %d году.".formatted(car.getBrand(),
                    car.getModel(), car.getYear() + 5));
        }
        return serviceList;
    }
}

package lesson21HomeWork;

import lesson21HomeWork.function.FunctionExample;
import lesson21HomeWork.supplier.SupplierExample;
import lesson21HomeWork.unaryOperator.UnaryOperatorExample;

import java.util.ArrayList;
import java.util.List;

public class StartClass {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 21");
        //Создадим пустой список для хранения автомобилей
        List<Car> cars = new ArrayList<>();

        //Заполним список сгенерированными по умолчанию машинами
        SupplierExample supplierExample = new SupplierExample();
        System.out.println("\nСписок автомобилей по умолчанию:");
        supplierExample.generateLengthListAndDefaultCars(cars);

        //Заменим объекты по умолчанию на настоящие
        UnaryOperatorExample unaryOperatorExample = new UnaryOperatorExample();
        System.out.println("\nСписок новых автомобилей:");
        cars = unaryOperatorExample.fillListNewCars(cars);

        //Создадим список сервисного обслуживания автомобилей и узнаем полную стоимость всех машин
        FunctionExample functionExample = new FunctionExample();
        System.out.println("\nСервисный список для будущего обслуживания:");
        functionExample.printServiceListAndPriceCars(cars);
    }
}

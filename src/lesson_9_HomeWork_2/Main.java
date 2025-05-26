package lesson_9_HomeWork_2;

/**
 * Класс для запуска/демонстрации
 */

public class Main {
    public static void main(String[] args) {
        MeasuringInstrument manometer1 = new Manometer("MPP3", 60, 25);
        Manometer manometer = new Manometer("MP4UU2", 100, 30);
        Sensor sensor = new Sensor("Rosemount", 50, 15);
        ThermalConverter thermalConverter = new ThermalConverter("TSP", 150, 40);

        System.out.println("Сравнение двух объектов одного класса записанных в переменные родительского класса:");
        System.out.println("Кодовое наименование - " + manometer.getCodeName() + "\nПредел измерения - " +
                manometer.getMeasuringLimit() + " ед." + "\nСрок службы - " + manometer.getServiceLife() + " мес.");
        manometer.measure();
        manometer.mount();
        System.out.println();
        System.out.println("Кодовое наименование - " + manometer1.getCodeName() + "\nПредел измерения - " +
                manometer1.getMeasuringLimit() + " ед." + "\nСрок службы - " + manometer1.getServiceLife() + " мес.");
        manometer1.measure();
        //manometer1.mount(); не можем вызвать данный метод

        System.out.println();
        System.out.println("Запакуем объекты в массив и выведем их на экран:");
        MeasuringInstrument[] instrumentsArray = {manometer, manometer1, sensor, thermalConverter};
        for (MeasuringInstrument el : instrumentsArray) {
            System.out.println("Кодовое наименование - " + el.getCodeName() + "\nПредел измерения - " +
                    el.getMeasuringLimit() + " ед." + "\nСрок службы - " + el.getServiceLife() + " мес.");
            el.measure();
            //Приведем каждый элемент к своему типу
            switch (el) {
                case Manometer manometer2 -> manometer2.mount();
                case ThermalConverter converter -> converter.convert();
                case Sensor sensor1 -> sensor1.defend();
                default -> System.out.println("Недопустимый тип!");
            }
            System.out.println();
        }
    }
}

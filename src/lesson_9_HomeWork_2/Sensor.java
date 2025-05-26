package lesson_9_HomeWork_2;

/**
 * Класс наследник: Датчик
 */

public class Sensor extends MeasuringInstrument {

    public Sensor(String codeName, int measuringLimit, int serviceLife) {
        super(codeName, measuringLimit, serviceLife);
    }

    public void defend() {
        System.out.println("Измеритель датчика находится во взрывозащищенном корпусе.");
    }

    @Override
    public void measure() {
        System.out.println("Датчик измеряет уровень воды.");
    }
}

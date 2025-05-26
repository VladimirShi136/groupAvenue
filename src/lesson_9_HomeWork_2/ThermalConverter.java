package lesson_9_HomeWork_2;

/**
 * Класс наследник: Термопреобразователь
 */

public class ThermalConverter extends MeasuringInstrument {

    public ThermalConverter(String codeName, int measuringLimit, int serviceLife) {
        super(codeName, measuringLimit, serviceLife);
    }

    public void convert() {
        System.out.println("Термопреобразователь конвертирует температуру в токовое значение.");
    }

    @Override
    public void measure() {
        System.out.println("Термопреобразователь измеряет температуру в емкости.");
    }
}


package lesson_9_HomeWork_2;

/**
 * Класс наследник: Манометр
 */

public class Manometer extends MeasuringInstrument {

    public Manometer(String codeName, int measuringLimit, int serviceLife) {
        super(codeName, measuringLimit, serviceLife);
    }

    public void mount() {
        System.out.println("Манометр легко собирать и устанавливать.");
    }

    @Override
    public void measure() {
        System.out.println("Манометр измеряет давление в газовой трубе.");
    }
}


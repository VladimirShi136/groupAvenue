package lesson_9_HomeWork_2;

/**
 * Абстрактный класс родитель: Средство измерения
 */

public abstract class MeasuringInstrument {
    private String codeName;
    private int measuringLimit;
    private int serviceLife;

    public MeasuringInstrument(String codeName, int measuringLimit, int serviceLife) {
        this.codeName = codeName;
        this.measuringLimit = measuringLimit;
        this.serviceLife = serviceLife;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public int getMeasuringLimit() {
        return measuringLimit;
    }

    public void setMeasuringLimit(int measuringLimit) {
        if (measuringLimit > 0 && measuringLimit <= 150) {
            this.measuringLimit = measuringLimit;
        } else {
            System.out.println("Значение \"" + measuringLimit + "\" недопустимое!");
        }
    }

    public int getServiceLife() {
        return serviceLife;
    }

    public void setServiceLife(int serviceLife) {
        if (serviceLife > 0 && serviceLife <= 60) {
            this.serviceLife = serviceLife;
        } else {
            System.out.println("Значение \"" + serviceLife + "\" недопустимое!");
        }
    }

    public abstract void measure();
}


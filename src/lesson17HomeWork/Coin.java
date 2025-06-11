package lesson17HomeWork;

import java.util.Objects;

public class Coin {
    private int nominal;
    private int year;
    private String metal;
    private double diameter;

    /**
     * @param nominal  - номинал монеты
     * @param year     - год выпуска
     * @param metal    - металл изготовления
     * @param diameter - диаметр монеты
     */
    public Coin(int nominal, int year, String metal, double diameter) {
        this.nominal = nominal;
        this.year = year;
        this.metal = metal;
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, year, metal, diameter);
    }

    @Override
    public String toString() {
        return "Монета: номинал - " + nominal + ", год выпуска - " + year +
                ", металл - " + metal + ", диаметр - " + diameter + ".";
    }


}

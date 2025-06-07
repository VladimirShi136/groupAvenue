package lesson17HomeWork;

public class SortedCoinComparator implements java.util.Comparator<Coin> {
    /**
     * @param o1 Первый объект для сравнения.
     * @param o2 Второй объект для сравнения.
     * @return Результат сравнения.
     */
    @Override
    public int compare(Coin o1, Coin o2) {
        // по диаметру от большего к меньшему
        if (o1.getDiameter() != o2.getDiameter()) return Double.compare(o2.getDiameter(), o1.getDiameter());
        // по году от меньшего к большему
        if (o1.getYear() != o2.getYear()) return Integer.compare(o1.getYear(), o2.getYear());
        // по металлу (по алфавиту от А до Я, от A до Z)
        if (!o1.getMetal().equals(o2.getMetal())) return o1.getMetal().compareTo(o2.getMetal());
        // по номиналу от меньшего к большему
        return Integer.compare(o1.getNominal(), o2.getNominal());
    }
}

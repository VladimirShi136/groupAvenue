package lesson_8;

import java.util.Objects;

public class Tour {
    private String country;
    private String town;
    private int days;
    private int price;
    private int stars;
    private String transport;
    private String food;

    public Tour(String country, String town, int days, int price, int stars, String transport, String food) {
        this.country = country;
        this.town = town;
        this.days = days;
        this.price = price;
        this.stars = stars;
        this.transport = transport;
        this.food = food;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    public int getStars() {
        return stars;
    }

    public String getTransport() {
        return transport;
    }

    public String getFood() {
        return food;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return days == tour.days && price == tour.price && stars == tour.stars && Objects.equals(country, tour.country) && Objects.equals(town, tour.town) && Objects.equals(transport, tour.transport) && Objects.equals(food, tour.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, town, days, price, stars, transport, food);
    }

    @Override
    public String toString() {
        return "Тур в страну " + country + " в городе " + town + '\'' +
                ", days=" + days +
                ", price=" + price +
                ", stars=" + stars +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}

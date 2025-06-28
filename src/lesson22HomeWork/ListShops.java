package lesson22HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShops {
    private final List<Shop> shops = new ArrayList<>();

    public ListShops() {
        Collections.addAll(shops,
                new Shop("Clothes", 500_000, 250),
                new Shop("Shoes", 350_000, 150),
                new Shop("Electronics", 800_000, 450),
                new Shop("Accessories", 150_000, 150),
                new Shop("Cosmetics", 500_000, 350),
                new Shop("Jewelry", 1_000_000, 150),
                new Shop("Books", 100_000, 120));
    }

    public List<Shop> getShops() {
        return shops;
    }
}

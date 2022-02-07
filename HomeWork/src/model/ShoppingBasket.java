package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    List<Product> products = new ArrayList<>();


    @Override
    public String toString() {
        return "ShoppingBasket{" +
                "products=" + products +
                '}';
    }
}

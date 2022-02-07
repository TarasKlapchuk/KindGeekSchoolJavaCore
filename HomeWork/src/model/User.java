package model;

public class User extends Person {



    public User(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    ShoppingBasket shoppingBasket = new ShoppingBasket();

    public Product buyProduct (Product product) {


        shoppingBasket.products.add(product);


        for (int i = 0; i < shoppingBasket.products.size(); i++) {
            System.out.println( "Your order is " + shoppingBasket.products.get(i).getProductName() + " with " + shoppingBasket.products.get(i).getCharacteristic());
        }

        return product;

    }

    public String viewOrder () {

        System.out.println(shoppingBasket.products.toString());

        return shoppingBasket.products.toString();
    }

}

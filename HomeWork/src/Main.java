import model.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Product.BRAND);

        Characteristic characteristic1 = new Characteristic("White", "Classic", "Velours");
        Characteristic characteristic2 = new Characteristic("Black", "Modern", "Cotton");
        Characteristic characteristicTwilli = new Characteristic("Red", "Classic", "Silk");

        Category bowTie = new Category("BowTie");
        Category childBowTie = new Category("Child BowTie", bowTie);
        Category AdultBowTie = new Category("Adult BowTie", bowTie);

        Category twilli = new Category("Twilli");
        Category childTwilli = new Category("Child Twilli", twilli);
        Category adultTwilli = new Category("Adult Twilli", twilli);



        Product product = new Product(ProductName.BowTie, 150, AdultBowTie, characteristic1);
        Product product1 = new Product(ProductName.BowTie, 180, childBowTie, characteristic2);
        Product product3 = new Product(ProductName.Twilli, 200, adultTwilli, characteristicTwilli);

        User user = new User("Taras", "Klapchuk", 29);

        user.buyProduct(product);
        user.buyProduct(product1);
        user.buyProduct(product3);
        user.viewOrder();






    }

}

package model;

public class Product {

    public static final String BRAND = "Fly High";

    private long id;
    private ProductName ProductName;
    private double price;
    private Category category;
    private Characteristic characteristic;

    public Product(model.ProductName productName, double price, Category category, Characteristic characteristic) {
        ProductName = productName;
        this.price = price;
        this.category = category;
        this.characteristic = characteristic;
        id++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public model.ProductName getProductName() {
        return ProductName;
    }

    public void setProductName(model.ProductName productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductName=" + ProductName +
                ", price=" + price +
                ", category=" + category +
                ", characteristic=" + characteristic +
                '}';
    }
}

package model;

public abstract class Product {

    public static final String BRAND = "Fly High";

    private String name;
    private int price;
    private Material material;


    public Product() {
    }

    public Product(String name, int price, Material material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public void buildProduct () {
        material.buyMaterial();
        System.out.println("start build product");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void greeting () {
        System.out.println("Hello the best brand in the world: " );
    }
}

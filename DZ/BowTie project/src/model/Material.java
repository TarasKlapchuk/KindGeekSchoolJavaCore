package model;

public class Material {

    private String colour;
    private int price;
    private boolean isAvailable = false;

    public Material(String colour, int price) {
        this.colour = colour;
        this.price = price;
    }

    public boolean buyMaterial () {
       isAvailable = true;
        System.out.println("bought the material");
        return isAvailable;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

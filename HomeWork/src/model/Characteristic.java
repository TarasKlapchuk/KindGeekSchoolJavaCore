package model;

public class Characteristic {


    private String colour;
    private String shape;
    private String material;

    public Characteristic(String colour, String shape, String material) {
        this.colour = colour;
        this.shape = shape;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "colour='" + colour + '\'' +
                ", shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

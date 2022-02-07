package model;

import java.util.ArrayList;
import java.util.List;

public class BowTie extends Product {

    private String shape;
    private List<BowTie> bowTies;

    public BowTie() {}
    public BowTie(String shape) {
        this.shape = shape;
    }

    public BowTie(String name, int price, Material material, String shape) {
        super(name, price, material);
        this.shape = shape;
        this.bowTies = new ArrayList<>();
    }

    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }

    public List<BowTie> getBowTies() {
        return bowTies;
    }
    public void setBowTies(List<BowTie> bowTies) {
        this.bowTies = bowTies;
    }

    @Override
    public void greeting () {
        System.out.println("Hello the best brand in the world of Bow Tie and shape of this Bow Tie is: " + this.getShape());
    }

    public void addBowTieToList (BowTie bowTie) {
        bowTies.add(bowTie);
        System.out.println("I add Bow Tie to list: " + bowTie.getName());
    }

    public void showBowTie () {
        for (int i = 0; i < bowTies.size(); i++) {
            System.out.println(bowTies.get(i).getName());
        }
    }


}

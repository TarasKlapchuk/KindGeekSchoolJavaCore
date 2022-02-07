package model;

public class Twilli extends Product {

    private int lengthTwilli;

    public int getLengthTwilli() {
        return lengthTwilli;
    }

    public void setLengthTwilli(int lengthTwilli) {
        this.lengthTwilli = lengthTwilli;
    }

    @Override
    public void greeting () {
        System.out.println("Hello from the class Twilli and length of the Twilli is: " + this.getLengthTwilli());
    }

}

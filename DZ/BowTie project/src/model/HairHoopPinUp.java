package model;

public class HairHoopPinUp extends Product {

    private String consistOf;

    public String getConsistOf() {
        return consistOf;
    }

    public void setConsistOf(String consistOf) {
        this.consistOf = consistOf;
    }

    @Override
    public void greeting () {
        System.out.println("Hello from the class HairHoopPinUp and it consists of: " + this.getConsistOf());
    }


}

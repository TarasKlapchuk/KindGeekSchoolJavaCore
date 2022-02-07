import model.*;

public class Main {
    public static void main(String[] args) {


        System.out.println(Product.BRAND);

        Material material = new Material("red", 200);

        BowTie bowTie = new BowTie("bow tie", 200, material, "classic");
        BowTie bowTie1 = new BowTie("bow tie1", 150, material, "Modern");
        BowTie bowTie2 = new BowTie("bow tie2", 180, material, "new");
        bowTie.greeting();
        bowTie.buildProduct();

        bowTie.addBowTieToList(bowTie);
        bowTie.addBowTieToList(bowTie1);
        bowTie.addBowTieToList(bowTie2);

        bowTie.showBowTie();



        Employee employee = new Employee("Taras", "Klapchuk", 0, 10000);
        employee.getSalary();
        employee.getYearSalary();



//        Twilli twilli = new Twilli();
//        twilli.setLengthTwilli(121);
//        twilli.greeting();
//
//        HairHoopPinUp hairHoopPinUp = new HairHoopPinUp();
//        hairHoopPinUp.setConsistOf("steel wire");
//        hairHoopPinUp.greeting();



    }
}

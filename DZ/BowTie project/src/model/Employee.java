package model;

public class Employee implements Salary {

    private String firstName;
    private String lastName;
    private int balance;
    private int monthSalary;

    public Employee(String firstName, String lastName, int balance, int monthSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.monthSalary = monthSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public void getSalary() {
        System.out.println("The employee salary is: " + getMonthSalary());
    }

    @Override
    public void getYearSalary() {
        setBalance(getMonthSalary() * 12);
        System.out.println("All balance: " + getBalance());
    }
}

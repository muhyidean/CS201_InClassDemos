package lesson5;

import lesson4.Address;

public class Employee{

    private String fName;
    private String lName;
    private double salary;
    private Address homeAddress;
    private Address workAddress;

    public Employee(String fName, String lName, double salary, Address homeAddress, Address workAddress) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress; // new Address("1000 4th N","Fairfield","IA",52557)
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public String toString(){
        return "----\nEmployee Name: " + this.fName + " " + this.lName + " \nSalary: " + this.salary + " \nWork Address: "  + workAddress.getStreet() + " " + workAddress.getZipcode();
    }

    public void printWorkAddress( ){
        System.out.println(this.workAddress.getStreet());
        System.out.println(this.workAddress.getCity());
        System.out.println(this.workAddress.getState());
        System.out.println(this.workAddress.getZipcode());
    }

}

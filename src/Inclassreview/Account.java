package Inclassreview;

public class Account {

    private int id;
    private String ownerName;
    private double balance;
    private Address address;

    private static final double INTEREST_RATE = 0.008;

    public Account() {

    }

    public Account (int id, String ownerName, double balance, Address address){

        this.ownerName = ownerName;
        this.id = id;
        this.balance = balance;
        this.address = address;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void deposit(double amount){
        this.balance += amount; // this.balance = this.balance + amount

    }

    public void withdraw(double amount){
        if(amount<=this.balance){
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient funds...");
        }
    }

    public void printInfo(){
        System.out.println("Id: " + this.id + "\t" + "Name: " + this.ownerName);
    }

    private double calcInterest(){
        return this.balance * INTEREST_RATE;
    }

    public void addInterest(){
        this.balance += calcInterest();
    }
}

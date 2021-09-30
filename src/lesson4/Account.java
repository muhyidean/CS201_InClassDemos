package lesson4;


public class Account {
    // Data members
    private int id;
    private String ownerName;
    private double balance;

    //Constructors
    public Account() {

    }

    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Methods
    public int getId(){
        return this.id;
    }

    public void setId(int id) {
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

    public void deposit(double amountToInput){
        this.balance += amountToInput;
    }

    public void withdraw(double amountToWithdraw){ // 1000
        if(this.balance>=amountToWithdraw){
            this.balance -= amountToWithdraw;
        }
        else{
            System.out.println("Insufficient funds available ... ");
        }
    }

    public void printBalance(){
        System.out.println("Account " + this.id + " balance: " + this.balance);
    }


}

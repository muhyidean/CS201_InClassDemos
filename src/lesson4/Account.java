package lesson4;


public class Account {

    // Data members
    private int id;
    private String ownerName;
    private double balance;
    private Address address;
    final static private double INTEREST_RATE = 0.03;

//    //Constructors
    public Account() {

    }
    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    // Account acct1 = new Account(111, "Dean", 500, null);
    public Account(int id, String ownerName, double balance, Address address) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString(){
        String obj = "AccountId: " + this.id + " Owner: " + this.ownerName;
        return obj;
    }

    public static void resetInfo( Account account){
        account.id = 000;
        account.ownerName = "Unknown";
        account.balance = 0;
    }

    public void addInterest(){
        double interest = calcInterest(); // PAUSE
        this.balance += interest;
    }

    private double calcInterest(){
        double interest = this.balance * INTEREST_RATE;
        return interest;
    }

}

package midtermexamsolutions;

public class Customer {

    // Customer has four fields: id(int), name(String), credit(int), address (Address).



    private int id;
    private String name;
    private double credit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public Customer(int id, String name, int credit, Address address) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addCredit(double amount){
        double r = amount / 100;
        int points = (int) r;
        this.credit += points * 5;
    }

    public double consumeCredits(double amount){
        double discount = amount * ( this.credit / 100);
        return amount - discount;
    }

}

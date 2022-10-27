package midtermexamsolutions;

public class Main {

    public static void main(String[] args) {


        Customer c1 = new Customer(111, "Ralph", 5,
                new Address("103 W Adams Ave", "Fairfield" , "IA", 52556));
        Customer c2 = new Customer(112, "Jane", 0,
                new Address("103 W Adams Ave", "Fairfield" , "IA", 52556));

        System.out.println( c1.getAddress().getStreet());

        c2.addCredit(550);
        System.out.println(c2.getCredit());
        System.out.println(c2.consumeCredits(200));
    }
}

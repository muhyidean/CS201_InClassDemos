package lesson4;


public class ATMApplication {

    public static void main(String[] args) {

        Address add1 = new Address("103 W Adams Ave", "Fairfield" , "IA", 52556);


        Account acct1 = new Account(111, "Dean", 200);
        Account acct2 = new Account(112, "Taye" , 100000, new Address("1000 N 4th" , "fairfield", "IA", 52557));
        Account acct3 = new Account();
        acct3.setBalance(1000);
        acct3.setId(113);
        acct3.setOwnerName("Rahel");


        acct1.setAddress(add1);

        acct1.printBalance();
        acct2.printBalance();

        acct1.deposit(500); // 700
        acct1.printBalance();
        acct1.withdraw(1000);
        acct1.withdraw(200);
        acct1.printBalance();

        Account.resetInfo(acct3);
        
        acct3.printBalance();

        System.out.println("---");
        System.out.println(acct1);

        Account [] accounts = {acct1, acct2, acct3};

        for (Account a : accounts){
            a.addInterest();
        }

        for(int i = 0; i<accounts.length ; i++){
            accounts[i].printBalance();
        }


        System.out.println( acct1.getAddress().getStreet());
//        System.out.println( add1.getStreet());

        System.out.println( acct2.getAddress().getStreet() );











    }

}

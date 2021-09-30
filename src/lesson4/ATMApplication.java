package lesson4;


public class ATMApplication {

    public static void main(String[] args) {

        Account acct1 = new Account(111, "Dean", 200);
        Account acct2 = new Account(112, "Taye" , 100000);

        acct1.printBalance();
        acct2.printBalance();

        acct1.deposit(500); // 700
        acct1.printBalance();
        acct1.withdraw(1000);
        acct1.withdraw(200);
        acct1.printBalance();


    }

}

package lesson4;


public class ATMApplication {

    public static void main(String[] args) {

        Account acct1 = new Account(111, "Dean", 200);
        Account acct2 = new Account(112, "Taye" , 100000);

        System.out.println("Account 1 balance: " + acct1.getBalance());
        System.out.println("Account 2 balance: " + acct2.getBalance());


    }

}

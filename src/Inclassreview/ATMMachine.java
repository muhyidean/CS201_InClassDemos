package Inclassreview;

public class ATMMachine {


    public static void main(String[] args) {
        Account acc1 = new Account(111,"John",3000,
                new Address("bla" ,"", "", 123));
        Account acc2 = new Account(112,"Jasmine", 5, null);

        System.out.println("============");
        System.out.println(acc1.getBalance());
        acc1.deposit(100);
        System.out.println(acc1.getBalance());
        acc1.withdraw(500);
        System.out.println(acc1.getBalance());
        acc1.printInfo();
        acc2.printInfo();
        System.out.println("Acc1: " + acc1.getBalance());
        acc1.addInterest();
        System.out.println("Acc1: " + acc1.getBalance());


    }

}

package lesson5;

import lesson4.Address;

public class InClassDemo {

    public static void main(String[] args) {

        Employee emp = new Employee("John","Smith",60000,
                new Address("103 W Adams", "Fairfield","IA", 52556),
                new Address("1000 4th N","Fairfield","IA",52557));


        // Print the state where the employee works:

        printAddress( emp.getWorkAddress() );

        emp.printWorkAddress();

    }


    public static void printAddress( Address address){

        System.out.println(address.getStreet());
        System.out.println(address.getCity());
        System.out.println(address.getState());
        System.out.println(address.getZipcode());
    }
}

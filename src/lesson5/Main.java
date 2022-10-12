package lesson5;

import lesson4.Address;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Zaineh", "Altarawneh", 120000,
                new Address("103" , "FF" , "IA" , 52556),
                new Address("1000 N 4th", "FF", "IA", 52557));

        Employee emp2 = new Employee("Yasmeen", "Altarawneh", 130000,
                new Address("103" , "FF" , "IA" , 52556),
                new Address("1000 N 4th", "FF", "IA", 52557));


        System.out.println(emp1);
        System.out.println(emp2);

        emp1.equals(emp2);
    }

}

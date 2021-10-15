package Project;

import java.util.ArrayList;

public class Demo {


    public static void main(String[] args) {

        Employee emp1 = new Employee(111, "Dean");
        Employee emp2 = new Employee(112, "Lwam" );

        emp1.getAddresses().add(new Address("FF", "IA"));
        emp1.getAddresses().add(new Address("OT", "IA"));

        emp2.getAddresses().add(new Address("CH", "IL"));

//        System.out.println(emp1.getAddresses().get(0).getCity());

        String [] names = {"Le", "John", "Eric"};

        for( String n : names){
            System.out.println(n);
        }

        for( Address a : emp1.getAddresses()){
            System.out.println(a.getCity());
        }

        for (int i = 0; i < emp1.getAddresses().size(); i++) {
            System.out.println(emp1.getAddresses().get(i).getCity());
        }



    }


}

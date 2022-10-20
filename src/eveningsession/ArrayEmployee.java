package eveningsession;

import lesson4.Address;
import lesson5.Employee;

public class ArrayEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Zaineh", "Altarawneh", 120000,
                new Address("103" , "FF" , "IA" , 52556),
                new Address("1000 N 4th", "FF", "IA", 52557));

        Employee emp2 = new Employee("Yasmeen", "Altarawneh", 130000,
                new Address("103" , "FF" , "IA" , 52556), null);

        Employee emp3 = new Employee("Mira", "Altarawneh", 180000,
                new Address("103" , "FF" , "IA" , 52556),
                new Address("1000 N 4th", "FF", "IA", 52557));

        Employee [] employees = {emp1, emp2, emp3};

        String [] result = worksAt(employees,"1000 N 4th");

        for (String name : worksAt(employees,"1000 N 4th")){
            System.out.println(name);
        }


    }


    public static int totalSalary( Employee [] employees){

        int sum = 0;
        for (int i = 0; i < employees.length ; i++) {
            sum+= employees[i].getSalary();
        }
        return sum;
    }

    public static double totalSalaryAvg( Employee [] employees){

        int sum = 0;
        for (int i = 0; i < employees.length ; i++) {
            sum+= employees[i].getSalary();
        }
        return sum / employees.length;
    }

    public static String [] worksAt(Employee [] employees, String street ){
        String [] result = new String[employees.length];
        int indexCounter = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getWorkAddress()!=null && employees[i].getWorkAddress().getStreet().equalsIgnoreCase(street) ){
                result[indexCounter] = employees[i].getFName() + employees[i].getLName();
                indexCounter++;
            }


        }
        return result;
    }

}

package lesson11;

import lesson4.Address;
import lesson5.Employee;

public class ArraysDemo {

    public static void main(String[] args) {
        Address add = new Address("1000 N", "FF", "IA", 52557);

        Employee emp1 = new Employee("Dean", "T",30000,add,add);
        Employee emp2 = new Employee("John", "B",40000,add,add);
        Employee emp3 = new Employee("Tina", "X",40000,add,add);

        Employee [] employees = new Employee[3];

        employees[0] = emp1;
        employees[1] = new Employee("John", "B",40000,add,add);
        employees[2] = emp3;

        Employee [] employees2 = {emp1, emp2 , emp3};

        employees2[1].setFName("Patrick");

        System.out.println(emp2.getFName());
        System.out.println(employees[1].getFName());
        System.out.println(employees2[1].getFName());


//        Employee [] employees = injectToArray(emp1, emp2, emp3);

//        for (Employee e : employees){
//            System.out.println(e);
//        }
    }


    public static Employee [] injectToArray(Employee emp1, Employee emp2, Employee emp3){

        Employee [] employees = new Employee[3];

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        return employees;
    }
}

package lesson11;

import lesson4.Address;
import lesson5.Employee;

public class ExerciseArrays {

    public static void main(String[] args) {
        Address add = new Address("1000 N", "FF", "IA", 52557);

        Employee emp1 = new Employee("Dean", "T",30000,add,add);
        Employee emp2 = new Employee("John", "B",40000,add,add);
        Employee emp3 = new Employee("Tina", "X",40000,add,add);

        Employee [] employees = {emp1, emp2, emp3};



    }


}

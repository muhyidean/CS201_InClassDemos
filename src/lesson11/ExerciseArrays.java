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

        deleteEmployee( employees , "Dean");

        for (Employee e : employees){
            System.out.println(e);
        }


    }
    /**
     * Take an array and a number
     * delete the object with the matching name
     *

     deleteEmployee(  employeeArray, employeeFname  )

     --> it should delete emp2
     */
    public static void deleteEmployee(Employee [] emps ,String name){

        for (int i = 0; i < emps.length; i++) {
            if(emps[i].getFName().equalsIgnoreCase(name))
                emps[i] = null;
        }
    }


}

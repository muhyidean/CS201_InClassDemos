package Quizzes;

import lesson4.Address;
import lesson5.Employee;

public class FinalExam {

    public static void main(String[] args) {

        Address add = new Address("1000 N", "FF", "IA", 52557);

        Employee emp1 = new Employee("Dean", "T",30000,add,add);
        Employee emp2 = new Employee("John", "B",40000,add,add);
        Employee emp3 = new Employee("Tina", "X",50000,add,add);
        Employee [] employees = {emp1, emp2 , emp3};

        filterEmployeesBySalary(employees, 35000);
//        filterEmployeesByRegion(employees,52552);
        System.out.println("============");

        String [] names = {"Dean", "Charles" , "Taye", "Isaac"};
        int [] result = countCharsPerElement(names);

        for(int i : result){
            System.out.println(i);
        }
        // = [4 , 7, 4 , 5]

        String [] names2 = new String[4];
        names2[0] = "Dean";
        names2[1] = "Charles";
        names2[2] = "Taye";
        names2[3] = "Isaac";

        System.out.println(names == names2);
        System.out.println(compareArrays(names, names2));
    }

    public static boolean compareArrays (String [] arr1 , String [] arr2){
        if(arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if(   !(arr1[i].equals(arr2[i]))  )
                return false;
        }

        return true;

        }

        public static int [] countCharsPerElement(String [] arr){
        int [] nums = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                nums[i] = arr[i].length();
            }
        return nums;
        }

        public static void filterEmployeesBySalary( Employee [] employees , int salary){

        for(Employee e : employees){
            if(e.getSalary() > salary)
                System.out.println(e);
        }
        }

        public static void filterEmployeesBySalary2( Employee [] employees , int salary){

            for (int i = 0; i < employees.length; i++) {
                if(employees[i].getSalary() > salary )
                    System.out.println(employees[i]);
            }
        }

    public static void filterEmployeesByRegion( Employee [] employees , int zipcode){

        for(Employee e : employees){
            if(e.getHomeAddress().getZipcode()==zipcode)
                System.out.println(e);
        }
    }



}

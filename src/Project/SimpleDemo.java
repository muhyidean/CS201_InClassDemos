package Project;

import java.util.ArrayList;

public class SimpleDemo {

    public static void main(String[] args) {

        ArrayList<Employee> emps = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(8);

        System.out.println("Size: " + nums.size());

        nums.remove(1);

        System.out.println("Size: " + nums.size());

        for(int i : nums){
            System.out.println(i);
        }

    }
}

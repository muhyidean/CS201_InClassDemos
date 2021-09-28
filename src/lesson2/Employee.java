package lesson2;

public class Employee {

    int id;
    String name;
    int salary;

    public Employee () {

    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int monthlyPayment(){
        int month = this.salary / 12;
        return month;
    }

}

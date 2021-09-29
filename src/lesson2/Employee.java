package lesson2;

public class Employee {

    int id;
    String name;
    int salary;
    static int counter = 0;

    public Employee () {

    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public int monthlyPayment(){
        int month = this.salary / 12;
        return month;
    }

}

package lesson2;

public class Main {

    public static void main(String[] args) {

        int x = 5;

        Employee emp1 = new Employee(111,"Dean",40000);
        Employee emp2 = new Employee(112, "Zaineh", 120000);
        Employee emp3 = new Employee(113, "Yasmeen", 130000);

//        Employee emp0 = emp1;
//        emp1 = new Employee();
//        emp0.name = "Charles";
//        System.out.println(emp1.name);

        Employee [] employees = {emp1, emp2 ,emp3};

        for(Employee e: employees){
            System.out.println(e.monthlyPayment());
        }
    }

    public static void print() {
        int y = 6 ;
        System.out.println(y);
    }
}

package lesson4;

public class Main {

    static int a = 5;

    // Make a method that takes 3 numbers and calculates the average
    public static double calcAvg (int a, int b, int c) {
        double result = (a + b + c) / 3;
        return result;
    }

    public static String getName(){
        int f = a;
        return "Dean Altarawneh";
    }

    public static String getNameTayeVersion(int s, int e){

        String name = "Dean Altarawneh";
        String updatedName = name.substring(s,e); // (5,15) --> Altarawneh
        return updatedName;
    }

    public static void main(String[] args) {

        Account acct1 = new Account(111, "Dean", 500); // 0 , null, 0


        System.out.println("Executed...1");
        int a = 2;
        int b = 4;
        int c = 6;
        double avg = Main.calcAvg(c,b,a); // 4.0 // PAUSE
        System.out.println(avg);
        System.out.println("Executed...2");
        System.out.println(Main.getName().substring(0,4)); // Dean
        System.out.println(Main.getNameTayeVersion(5,15)); // Dean Altarawneh
    }


}

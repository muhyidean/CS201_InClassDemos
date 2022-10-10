package lesson4;

public class InClassDemo {

    static int y = 5;

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        System.out.println( addNumbers(x,y) );

        int i = addNumbers(x,y);

//        System.out.println("x: " + x);
//        System.out.println("y: " + y);

        InClassDemo obj = new InClassDemo();
        obj.printSomething();

//        InClassDemo.printSomething();


    }

    // Will add two numbers and give the result back
    public static int addNumbers( int a, int b ){
       return  a + b;
    }

    public static int addNumbers( int a, int b ,int c){

        return  a + b + c;
    }

    public void printSomething(){
        System.out.println("Hello!");
    }




}

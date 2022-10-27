package eveningsession;

import lesson4.Address;
import lesson5.Employee;

public class GenericMethod {


    public static void main(String[] args) {


        Employee s = getSomething();
        System.out.println(s);
    }

    public static  <T> T getSomething(){
        Object o = new Employee();
        T g = (T) o;
        return g;
    }
}

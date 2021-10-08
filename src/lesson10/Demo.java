package lesson10;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


        String sentence = "We are happy people";

        String name = "lalaland";

        System.out.println( Demo.findMiddleChar(name) );

        int firstA = name.indexOf(' '); // 1
        int secondA = name.indexOf(' ',firstA+1);
        System.out.println(firstA);
        System.out.println(secondA);
    }

    public static char findMiddleChar(String word){
        int middleIndex = word.length()/2;
        return word.charAt(middleIndex);
    }


}

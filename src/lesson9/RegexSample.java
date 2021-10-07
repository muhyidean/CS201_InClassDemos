package lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSample {

    public static void main(String[] args) {

        String pid = "P1234";
        //1st way
        Pattern p = Pattern.compile("P[0-9]+");//. represents single character
        Matcher m = p.matcher("P1234");
        boolean b = m.matches();

        //2nd way
        boolean b2 = Pattern.compile("P[0-9]+").matcher("P1234").matches();

        //3rd way
        boolean b3 = Pattern.matches("P[0-9]+", "P1234");

        //4th way (using a String)
        boolean b4 = pid.matches("P[0-9]+");

        // Testing regex examples
        System.out.println(b+" "+b2+" "+b3+" " + b4);

    }
}

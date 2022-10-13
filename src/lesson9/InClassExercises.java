package lesson9;

public class InClassExercises {

    public static void main(String[] args) {


        // Write the pattern to check the following

        // 1. {gray, grey}
        String s1 = "grey";
        System.out.println( s1.matches("gr[ea]y")  );

        // 2.  {color, colour}
        String s2 = "color";
        String s3 = "colour";
        System.out.println( s2.matches("col(o|ou)r")  );
        System.out.println( s3.matches("col(o|ou)r")  );

        // 3. {gogle, google, gooogle, goooogle, ...}
        String s4 = "goooogle";
        String s5 = "google";
        String s6 = "gooooooooooogle";
        System.out.println(s4.matches("goo+gle"));
        System.out.println(s5.matches("goo+gle"));
        System.out.println(s6.matches("goo+gle"));

    }
}

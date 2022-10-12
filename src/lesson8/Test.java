package lesson8;

public class Test {



    public static void main(String[] args) {
        String n = "Dean";
        String c = "Dean";
        System.out.println();
        System.out.println(n == c );

        System.out.println(  countChars('o',"I am a strong person"));
    }

    public static int countChars(char c, String sentence){ // I am a strong person

        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == c)
                counter++;
        }

        return counter;
    }
}

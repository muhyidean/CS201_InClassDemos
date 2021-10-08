package lesson10;

public class StackTraceExample {

    public static void main(String[] args) {

        String text = "Isaac";
        int ans = methodA(text); // ISaac
        System.out.println("from Main method");
        System.out.println(ans);
        System.out.println("Hello");

    }

    public static int methodA (String word){ // ISaac
        String result = methodB(word);
        System.out.println("from methodA");
        return result.length();
    }

    public static String methodB(String word) {
        String newString = word + word; // ISaacISaac
        System.out.println("from methodB");
        return newString;
    }
}

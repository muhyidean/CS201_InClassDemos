package lesson9;

public class Main {

    public static void main(String[] args) {

        String id = "P";

        boolean isValidId = id.matches("P[0-9]+");

        if(isValidId)
            System.out.println("Is valid");
        else
            System.out.println("Invalid");

    }
}

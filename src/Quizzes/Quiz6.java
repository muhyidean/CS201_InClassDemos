package Quizzes;

public class Quiz6 {

    public static void main(String[] args) {

        generateEmail("Dean" , "Altarawneh");
    }

    /**
     *
     Write a method that will take a student's first name and last name and it will produce an MIU email.
     Note: the email format is the first letter of the first name and the full last name followed by @miu.edu. The returned string should be all lower case.

     Example:
     "Muhyieddin" "Altarawneh" --> maltarawneh@miu.edu
     */
    public static void generateEmail(String fName, String lName){
        System.out.println(fName.toLowerCase().charAt(0) + lName.toLowerCase() + "@miu.edu");
    }
}

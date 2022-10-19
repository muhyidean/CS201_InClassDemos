package lesson9;

public class MidTermReview {

    public static void main(String[] args) {

        String t = " Dean Khaled Ibrahim Altarawneh";



        System.out.println("=======");
        System.out.println(countChar("lalaland" , 'd'));
        numberFormat(3456782344l);
        extractNumber("111-222-1234 lalaland");
        System.out.println( replaceAll("I went to the school this morning.",'e','@'));
        System.out.println( Capitalize("I went to the school this morning."));
        System.out.println( beginsWith("Muhyieddin", "Muh"));

    }

    /*

4) What is the range of the generated random number:
Random rand = new Random();
int r = rand.nextInt(5) + 5;
System.out.println(r);

a) (0-5)				b) (5-10)
c) (0-10)				d) (5-9)

5) What is the output of the following code:
(Note: The ASCII reference of ‘A’  65)
char c = 'A';
int i = c + c;
System.out.println(i);

a) AA					b) A
c) 130					d) 65

6) What is the output of the following code?
int x = 50;
boolean first  = x > 0;
boolean second = x <=100;
boolean third  = x >60;
boolean isOk = (first && second || third);
System.out.println(isOk);

a) true					b) false

     */


    /*
	Write a method called numberFormat() that will
	take a phone number, which must be a Long number.
	The method verifies IF the number is equal to
	10 digits. If true, it should print it out in
	the following format ---> xxx-xxx-xxxx. If false,
	it should print out an error message.
	*/

    public static void numberFormat(long number){
        String numberText = String.valueOf(number);
        if(numberText.length()!=10)
            System.out.println("Invalid number");
        else
            System.out.println(numberText.substring(0,3)+"-"+numberText.substring(3,6)+"-"+numberText.substring(6));
    }

    /*
    Write a function that will take a number from a string and extract the
    number from one of the following formats
    (111) 222 3333    111-222-3333     1112223333
     */
    public static void extractNumber(String number){
        StringBuffer pureNumber = new StringBuffer("");

        for (int i = 0; i < number.length(); i++) {
            String ch = String.valueOf(number.charAt(i));
            if(ch.matches("[0-9]"))
                pureNumber.append(ch);
        }

        if(pureNumber.length()!=10)
            System.out.println("Invalid number");
        else
            System.out.println("Valid: " + pureNumber);
    }



    /*
    Create a method replaceAll() that will take a word and two character, one to find and one to replace with.
    It should replace all matches
     */
    public static String replaceAll(String word, char f, char r){
        StringBuffer sb = new StringBuffer(word);
        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i)==f)
                sb.setCharAt(i,r);
        }
        return sb.toString();
    }
    /*
    Write your own method beginsWith() to check if a word starts with a given string
     */
    public static boolean beginsWith(String word, String begins){ // "Muhyieddin" , "Muh"

        for (int i = 0; i < begins.length() ; i++) {
            if(begins.charAt(i) != word.charAt(i))
                return false;
        }

        return true;
    }
    /*
    Write a method that takes a sentence and makes every word capital
     */
    public static String Capitalize(String sentence){
        StringBuffer sb = new StringBuffer(sentence.trim());

        for (int i = 0; i < sb.length(); i++) {

            if(sb.charAt(i) == ' '){
                if(sb.charAt(i+1) >= 'a' && sb.charAt(i+1)<='z' ){
                    sb.setCharAt(i+1 , (char) (sb.charAt(i+1)-32));
                }
            }
        }
        return sb.toString();
    }

    /*

    Make a method that will calculate the discount according to the number of books purchased. The discount applies on the total cost.

Discount/#Books	        3 books	        5 books
Without membership	    2%	            6%
With membership	        5%	            15%
     */

    public static double calcDiscount(boolean isMember, int numBooks){
        boolean books3 = numBooks >=3 && numBooks <5;
        boolean books5 = numBooks >=5;

        if(books5){
            if(isMember)
                return 0.15;
            else
                return 0.06;
        } else if (books3){
            if(isMember)
                return 0.05;
            else
                return 0.02;
        }
        else
            return 0;
    }

    /*
        if(books5 && isMember)
            return 0.15;
        else if(books5 && !isMember)
            return 0.06;
        else if(books3 && isMember)
            return 0.05;
        else if(books3 && !isMember)
            return 0.02;
        else
            return 0;
     */

    /*
    Write a method that takes a word and counts how many a's it has. Then make a generic one too
     */
    public static int countChar(String text, char c){

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == c)
                counter++;
        }
        return counter;
    }


    public static boolean areRelatives(String n1, String n2){
        int lastSpaceIndex = n1.lastIndexOf(' ');
        String lastName = n1.substring(lastSpaceIndex+1); // last name from n1
        boolean result =  n2.endsWith(lastName); // John Don Smith  -  Smith
        return result;
    }
}






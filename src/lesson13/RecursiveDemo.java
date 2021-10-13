package lesson13;

public class RecursiveDemo {

    public static void main(String[] args) {

//        System.out.println(factorial(4));
//        printCharsRec("Dean", 0);
//        System.out.println(summation(3));
//        System.out.println(countAInWord("ADeana",0));
        System.out.println(countChar("Adeana",0, 'a'));
    }


    public static int factorial( int n ){
        // base case
        if(n ==1)
            return 1;
        else // recursive case
            return n * factorial(n-1);

    }

    public static void printCharsRec(String word, int index){
        if(index == word.length())
            return;
        else{
            System.out.println(word.charAt(index));
            printCharsRec(word, index + 1);

        }
    }

    public static int summation(int n){
        if(n == 1)
            return 1;
        else
            return n + summation(n - 1);
    }


    public static int countAInWord(String word, int i){ // 0

        if(i == word.length())
            return 0;
        else
            if(word.charAt(i) == 'A' || word.charAt(i) == 'a')
                return 1 + countAInWord(word, i+1);
            else
                return 0 + countAInWord(word, i+1);
    }

    public static int countChar(String word, int i, char c){ // 0

        if(i == word.length())
            return 0;
        else
        if(word.toLowerCase().charAt(i) == c)
            return 1 + countChar(word, i+1, c);
        else
            return 0 + countChar(word, i+1, c);
    }

    public static int countCharLoop(String word, char c){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().charAt(i) == c)
                count++;
        }
        return count;
    }

}

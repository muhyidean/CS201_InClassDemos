package lesson13;

public class RecursiveDemo {

    public static void main(String[] args) {

//        System.out.println(factorial(5));
//        printCharsRec("Dean", 0);
//        System.out.println(summation(3));
//        System.out.println(countAInWord("ADeana",0));
//        System.out.println(countChar("Adeana",0, 'a'));

        int [] arr = {6,9,3,5,6,1,7,4,3};
        System.out.println(findMin(arr,0));
//
//        printReversed(arr,0);


    }


    public static int factorial( int n ){
        // base case
        if(n ==1)
            return 1;
        else // recursive case
            return n * factorial(n-1);

    }

    public static void printCharsRec(String word, int index){ //
        if(index == word.length())
            return;
        else{
            printCharsRec(word, index + 1);
            System.out.println(word.charAt(index));

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
                return countAInWord(word, i+1);
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

    public static int findMin(int [] arr, int index){
        int nextVal;
        if(index == arr.length-1)
            return arr[index];
        else
            nextVal = findMin(arr, index+1);
            if(arr[index] < nextVal)
                return arr[index];
            else
                return nextVal;
    }


    public static int countCharsString(String word, int i){
        if (i == word.length())
            return 0;
        else
            return 1 + countCharsString(word,i + 1);
        }


    public static void printReversed(int [] arr) {
        printReversed(arr, 0);
        }


    public static void printReversed(int [] arr, int index) {
        // base case
        if(index == arr.length)
            return;
        // recursive case
        else{
            printReversed(arr , index + 1);
            System.out.println(arr[index]);
        }








    }

}

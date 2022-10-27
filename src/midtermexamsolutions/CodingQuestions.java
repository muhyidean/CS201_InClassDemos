package midtermexamsolutions;

import java.util.Random;

public class CodingQuestions {

    public static void main(String[] args) {

        String s1 = "I went to the school";
        String s2 = "Cedar Rapids";
        String s3 = "Hello";
        String s4 = "I am very happy";
        String s5 = "I am strong";

        System.out.println(getThirdWord(s1));
        System.out.println(getThirdWord(s2));
        System.out.println(getThirdWord(s3));
        System.out.println(getThirdWord(s4));
        System.out.println(getThirdWord(s5));
    }


    public static int calcTaxRate( String ms, int salary){
        boolean isSingle = ms.equalsIgnoreCase("single");

        if(isSingle){
            if(salary<=40000)
                return 10;
            else
                return 18;
        }
        else{
            if(salary<=60000)
                return 10;
            else
                return 18;
        }
    }


    public static void coinToss(int num){
        Random random = new Random();

        int r;
        for (int i = 0; i < num; i++) {
            r = random.nextInt(2);
            System.out.println(r==0?"H":"T");
        }
    }


    public static String getThirdWord(String sentence){
        int spaceCounter = 0;
        int space2 = 0;
        int space3 = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                spaceCounter++;
                if(spaceCounter == 2)
                    space2 = i;
                if(spaceCounter == 3)
                    space3 = i;
            }
        }
        if(spaceCounter<2)
            return "-1";
        else if(spaceCounter == 2)
            return sentence.substring(space2+1);
        else
            return sentence.substring(space2+1,space3);
    }

}

package lesson9;

public class StringBufferSample {

    public static void main(String[] args) {

        String name = "Deana";

        name = name.replace('a' , '@');
        System.out.println( name);

        StringBuffer buffer = new StringBuffer("");

        buffer.append("Dean");
        buffer.append(" ");
        buffer.append("Altarawneh");
        
        buffer.setCharAt(0,'B');

        System.out.println(buffer);

        StringBuffer mutableWord = new StringBuffer("isaac");

        mutableWord.append(" is sad");
        int index = mutableWord.indexOf("sad");
        System.out.println(mutableWord);
        System.out.println(index);
        mutableWord.replace(9,12,"glad");
        System.out.println(mutableWord);

    }
}

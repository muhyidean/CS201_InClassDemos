package lesson9;

public class StringBufferSample {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        buffer.append("Dean");
        buffer.append(" ");
        buffer.append("Altarawneh");
        
        buffer.setCharAt(0,'B');

        System.out.println(buffer);
    }
}

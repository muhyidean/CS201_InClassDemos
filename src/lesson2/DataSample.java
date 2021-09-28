package lesson2;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSample {


    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");

        String formattedDate = sdf.format(date);

        System.out.println(formattedDate);
    }

}

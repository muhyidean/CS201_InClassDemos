package lesson8;

public class ComparingStrings {


    public static void main(String[] args) {


        String n1 = "Dean";

        String n2 = "Deana";

        String n3 = "dean";

        String l1 = "z";

        String l2 = "a";

        String name1 = "Dean Altarawneh";
        String name2 = "Zaineh Altarawneh";

        System.out.println("---");
        System.out.println(areRelatives( name1, name2));


//
//        System.out.println(n1.compareTo(n2));
//        System.out.println(n1.compareTo(n3));
//        System.out.println(l1.compareTo(l2));

    }

    public static boolean areRelatives(String lastname, String n1, String n2){

        return  (n1.endsWith(lastname) && n2.endsWith(lastname));

    }

    /**
     *
     * @param n1 This is the first name
     * @param n2
     * @return
     */
    public static boolean areRelatives( String n1, String n2){

        // "Dean Altarawneh"
        int index = n1.indexOf(' '); // 5
        String lastName = n1.substring(index,n1.length()); // 5 , 16
        return  n2.endsWith(lastName);

    }

}

package lesson11;

public class ForEachDemo {

    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0]= 5;
        arr[1] = 9;
        arr[2] = 2;

        for (int i:arr){
            i = 3;
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3;

        }

        System.out.println(arr[0]);

    }
}

package lesson12;

public class Main {

    public static void main(String[] args)  {

        int [] subArr = new int[5]; // {0,0,0,0,0}

        int [][] arr = new int[3][]; // arr = { {0,0,0} , {0,0,0,0} , {0,0,0,0,0} }

        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = subArr;

        System.out.println(arr[1]);
    }
}

import java.util.Scanner;

public class ReverseArray {
    static Scanner sc=new Scanner(System.in);

    public static int[]  ReadInteger(int count){
        int[] arr=new int[count];
        for (int i = 0; i < arr.length; i++) {
            int number=sc.nextInt();
            arr[i]=number;
        }
        return arr;
    }
    public static void reverse(int[] arr){
        

    }
}

import java.util.Scanner;
public class MinElement {
   static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int count=sc.nextInt();
        int[] ReturnedArray=ReadInteger(count);
//        System.out.println(ReturnedArray);
        int min=FindMin(ReturnedArray);
        System.out.println(min);
    }

    public static int[]  ReadInteger(int count){
        int[] arr=new int[count];
        for (int i = 0; i < arr.length; i++) {
        int number=sc.nextInt();
            arr[i]=number;
        }
        return arr;
    }

    public static int FindMin(int[] arr){
        int temp=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int value=arr[i];
            if(value<temp){
                temp=value;
            }
        }
        return temp;
    }
}

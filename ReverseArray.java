package Array;
import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int numbers[]){
        int start=0;
        int end=numbers.length-1;

        while(start<end){

            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;

     start++;
     end --;



        }




    }


   public  static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter array size:");
       int size = sc.nextInt();

       int numbers[] = new int[size];

       System.out.println("Enter array elements:");

       for (int i = 0; i < numbers.length; i++) {
           numbers[i] = sc.nextInt();
       }
       reverse(numbers);

       System.out.println("Reversed array:");

       for (int i = 0; i < numbers.length; i++) {
           System.out.println(numbers[i]);
       }





   }

}

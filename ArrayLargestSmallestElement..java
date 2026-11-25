
package Array;

public class Arraycc {

    public int getArray(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
         System.out.println(" THE smallests value is"+smallest);
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = {3, 2, 6, 5, 4, 1};

        Arraycc obj = new Arraycc();

        System.out.println("The largest VALUE is " + obj.getArray(numbers));
    }
}

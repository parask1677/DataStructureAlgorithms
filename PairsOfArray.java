package Array;


    public class PairsOfArray{

        public static void PairsNumbers(int numbers[]){

            for(int i=0;i<numbers.length;i++){

                int curr=numbers[i];

                for(int j=i+1;j<numbers.length;j++){

                    System.out.println("("+curr+","+numbers[j]+")");
                }
                System.out.println();



            }




        }



       public  static void main(String[] args) {
           int numbers[]={1,2,3,4,5,6};

           PairsNumbers(numbers);

        }







    }

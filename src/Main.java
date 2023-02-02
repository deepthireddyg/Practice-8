import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //bubblesort
      // Main m1 = new Main();
       //Integer[] k = {2,4,3,100,50};
     // Integer[] p= m1.bubblesort(k);
      // System.out.println(Arrays.toString(p));
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
        int num=sc.nextInt();
        int rev=0;
       while(num!=0){
           rev=rev*10+num%10;
           num=num/10;
         }
//        System.out.println(rev);
//        Integer[] arr={1,2,3,4,5,6,7,8};
//        int maxSum=0;
//        int sum=0;
//        for(int i=0;i<arr.length-2;i++){
//            for(int j=i;j<=i+2;j++){
//                sum+=arr[j];
//            }
//            if(maxSum<sum) maxSum=sum;
//              sum=0;
//        }
//        System.out.println(maxSum);
       //--------------------------------------------
        //CREATING SUBARRAY FROM ANOTHER ARRAY
//        int[] array = new int[] {1,2,3,4,5};
//        int[] subarray = Arrays.copyOfRange(array,0,2);
//        System.out.println("Array: ");
//        for(int i=0;i< array.length;i++){
//            System.out.println(array[i] + " ");
//        }
//        System.out.println("SubArray: ");
//        for(int i=0;i< subarray.length;i++){
//            System.out.println(subarray[i] + " ");
//        }
//        int elements[] = new int[]{2, 4, 7, 5, 19}; // integer array
//              Main me = new Main();
//               me.printMissingElement(elements, 19); // passing array element and total element.
//
      }

        //BuBBLE SORT
        public Integer[] bubblesort(Integer[] a){
            int n = a.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1;j++){
                    if(a[j]>a[j+1]){
                        int temp= a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
           return a;
        }


        //COMBINATION SUM
        public int combinationSum(int[] input) {
            int total = 0;
            for (int i = 0; i < input.length; i++) {
                int k = 0;
                for (int j = 0; j < input.length; j++) {
                    total = total + k + input[j];
                    k = k + input[j];
                }
            }
            return total;
        }

        // PRINT MISSING ELEMENT.
        void printMissingElement(int[] numbers, int totalelement) {
             int i=0;
             Boolean missingElement;
             while(i<totalelement){
                 missingElement=true;
                 for(int j=0;j< numbers.length;j++){
                     if(totalelement==numbers[j]){
                         missingElement=false;
                     }
                 }
                 if(missingElement==true){
                     System.out.println(totalelement);
                 }
                 --totalelement;
             }

        }



    }

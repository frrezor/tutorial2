import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
          System.out.println("Task 1:");
         int [] array1= {1,2,3,4,5,6};
          int[] OddArray1=  filterIndexOddValue(array1);
          System.out.println(Arrays.toString(OddArray1));
          System.out.println();

          System.out.println("Task 2:");
          int [] array2= {3,3,3,3,5,6,3};
          System.out.println( "The dominant is "+ findDominant(array2));
          System.out.println();

          System.out.println("Task 3:");
          Scanner sc = new Scanner(System.in);
          int [] array3= {1,2,3,4,5,6,7};
          System.out.println("Provide a number of positions o rotate");
          int n = sc.nextInt();
            int[] result=rotateArray(array3,n);
            System.out.println(Arrays.toString(result));

    }
    //task1
    public static int[] filterIndexOddValue(int [] arr) {
         int count =0;
         for ( int i = 0 ; i < arr.length ; i++) {
             if ( arr[i] % 2 != 0 ) {
                 count++;
             }
         }
         int[] OddArray= new int[count];
         int index=0;
         for ( int i = 0 ; i < arr.length ; i++) {
             if ( arr[i] % 2 != 0 ) {
                 OddArray[index++]=arr[i];
             }
         }
         return OddArray;
    }
    //task2
    public static int findDominant (int[] arr) {
         int count=0;
         int index=-1;
         for ( int num: arr) {
             if(count==0) {
                 index=num;
             }
             count+= (num==index) ? 1 : -1;
         }
          count=0;
           for(int num:arr) {
               if(num==index) {
                   count++;
               }
           }
            if ( count>arr.length/2) {
                return index;
            }
            else {
                return -1;
            }

    }
    //task3
    public static int [] rotateArray (int [] arr,int n){
        int a =arr.length;
        n=n%a;
        int [] rotatedArray = new int [a];
         for (int i = 0; i < n; i++) {
             rotatedArray[i]=arr[a-n+i];
         }
        for (int i = n; i < a; i++) {
            rotatedArray[i] = arr[i-n];
        }
       return rotatedArray;
    }
}
import java.util.Arrays;


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
}
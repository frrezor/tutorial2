import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
         int [] array1= {1,2,3,4,5,6};
          int[] OddArray1=  filterIndexOddValue(array1);
          System.out.println(Arrays.toString(OddArray1));



    }

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
}
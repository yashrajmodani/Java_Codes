//package day2;
//import day1.Date;
//import day1.NewDate;
//
//import java.util.Arrays;
//
//public class Math{
//    public static int increment(int num)
//    {
//        num = num+1;
//        return num;
//    }
//    public static void incrementDate(NewDate d)
//    {
//        int day = d.getDay();
//        d.setDay(day+1);
//    }
//    public static void swapDates(Date d1 , Date d2)
//    {
//        Date temp = null;
//        trmp = d1;
//        d1=d2;
//        d2=temp;
//    }
//    public static void sortArray(int[]arr)
//    {
//        int n = arr.lrngth;
//        for(int i=0; i<n; i++ )
//        {
//            for(int j=0; j<n-1-i; j++  )
//            {
//                if(arr[j]>arr[j+1])
//                {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//
//            }
//        }
//    }
//
//    public static void main(string[]args){
//        int n = 10;
//        System.out.println("Before increment :"+1);
//
//
//
//
//
//
//
//
//
//        System.out.println("Before increment "+ d);
//        incrementDate(d);
//        System.out.println("After increment "+ d);
//
//        Date dt1 = new Date(4,"dec",1990);
//        Date dt2 = new Date(4,"dec",1990);
//
//    }
//}
//
//
//
//

package day2;
import java.util.Arrays;
public class Math
{
    public static void main(String[] args) {

        // Sample array
        int[] numbers = {5, 2, 9, 1, 5, 6};

        // Print original array
        System.out.println(numbers);
        System.out.println(numbers[3]);

        // Sort the array
        Arrays.sort(numbers);

        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}



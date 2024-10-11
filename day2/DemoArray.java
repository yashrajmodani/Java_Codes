package day2;
import day1.Date;


public class DemoArray
{
    public static void main(String[] args) {
        int[]arr = {12,13,14,15,16};
        for(int i : arr)
        {
            if(i%2==0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        }

        Date[] dd = new Date[3];
        dd[0] = new Date();
        dd[0].setDate(10, "Aug", 2024 );
        dd[1] = new Date();
        dd[1].setDate(13, "Aug", 2024 );
        dd[2] = new Date();
        dd[2].setDate(15, "Aug", 2024 );

        for(Date d : dd){
            d.displayDate();
        }
    }
}
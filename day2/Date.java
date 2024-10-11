package day2;
//import java.util.Scanner;
//
//public class Date {
//    private int day;
//    private Month month;
//    private int year;
//
//    public void setDate(int day, Month month, int year)
//    {
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }
//    public void displayDate()
//    {
//        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
//    }
//
//    public static void main(String[] args) {
//
//        Month[] month = Month.values();
//        for(Month m: month)
//        {
//            System.out.println(m);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the date.");
//        Date d = new Date();
//        int day = sc.nextInt();
//        String mon = sc.next().toUpperCase();
//        int year = sc.nextInt();
//        d.setDate(day, Month.valueOf(mon), year);
//        d.displayDate();
//    }
//}




public class Date {
    private int day;
    private String month;
    private int year;

    //method declaration
    public void setDate(int d, String m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public Date(int d, String mon, int y){
        setDate(this.day = d, this.month = mon, this.year = y);
    }

    public String toString()
    {
        return "Date: " + this.day + "/" + this.month + "/" + this.year;
    }
}

package day1;
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

    public void displayDate()
    {
        System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
    }
}

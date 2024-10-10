package day1;

public class NewDate
{
    private int day ;
    private String month ;
    private int year;

    public void setDay(int day){
        if(day < 0)
            System.out.println("Invalid Input");
        else
            this.day = day;
    }
    public int getDay(){
        return day;
    }

    public void setMonth(String month){
        this.month = month;
    }

    public String getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }

//    NewDate(int day, String month, int year){
//        this.day = day;
//        this.month = month;
//        this.year = year;
//    }

}

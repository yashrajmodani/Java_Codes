package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024,12,12,16,23,40);
        System.out.println(dt);

        String date = dt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a"));
        System.out.println(date);

        date = dt.format(DateTimeFormatter.ofPattern("E-MM-yy HH:mm:ss "));
        System.out.println(date);

        String myDate = "2024/12/12 04:23:40";

        LocalDateTime mydt = LocalDateTime.parse(myDate, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(mydt);
    }
}

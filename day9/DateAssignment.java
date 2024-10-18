package day9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DateAssignment {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // divisible by 400
            }
            return true; // divisible by 4 but not by 100
        }
        return false; // not a leap year
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.parse("2001-09-01", DateTimeFormatter.ISO_DATE);
        LocalDate now = LocalDate.now();
        Long totalDays = ChronoUnit.DAYS.between(birthDate, now);
        Period age = Period.between(birthDate, now);
        System.out.println(" age years: " + age.getYears() +" age months: " + age.getMonths() +" Age Days: "+ age.getDays());
        System.out.println(totalDays);

        int year = 2025;
        //find out programmers day without using plusDays
        if(isLeapYear(year))
            System.out.println("September 12");
        else System.out.println("September 13");

        //find out all the month that started on a sunday in year 2024
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        year = 2024;
        for(int month=1; month<=12; month++){
            LocalDate date = LocalDate.of(year, month, 1);
            if(date.getDayOfWeek() == DayOfWeek.SUNDAY){
                System.out.println(month);
            }
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //if we leave mumbai at 02:05am and arrive in newyork at 04:40pm. how long is the flight java code

        ZoneId mumbaiZone = ZoneId.of("Asia/Kolkata");
        ZoneId nyZone = ZoneId.of("America/New_York");

        LocalDateTime departureTime = LocalDateTime.of(2024, 10, 7, 2, 5);
        LocalDateTime arrivalTime = LocalDateTime.of(2024, 10, 7, 4, 40);
        ZonedDateTime departureDateTime = ZonedDateTime.of(departureTime, mumbaiZone);
        ZonedDateTime arrivalDateTime = ZonedDateTime.of(arrivalTime, nyZone);

        Duration flightDuration = Duration.between(departureDateTime, arrivalDateTime);

        long hours = flightDuration.toHours();
        long minutes = flightDuration.toMinutes() % 60;

        System.out.println("Flight duration: " + hours + " hours and " + minutes + " minutes");

    }

}

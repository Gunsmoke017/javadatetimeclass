package datetimeclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeLClass {
    public static void main(String[] args) {
        LocalDate date;
        LocalDate date2;
        LocalTime time;
        LocalDateTime dateTime;

        DateTimeFormatter dateTimeFormatter, dateTimeFormatter1, dateTimeFormatter2, dateTimeFormatter3, dateTimeFormatter4,dateTimeFormatter5;
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        dateTimeFormatter4 = DateTimeFormatter.ofPattern("E,MMM dd yyyy HH");
        dateTimeFormatter5 = DateTimeFormatter.ofPattern("EEEE,MMMM dd yyyy HH");



        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.now();
        date2 = LocalDate.of(2023,5,29);
        Period until = date.until(date2);
        System.out.println("");
        System.out.println(until.getChronology());
        System.out.println("Buhari has " + until.getYears() +" years, "+ until.getMonths() + " months and "+ until.getDays()+  " days until he don kpafuka");

        System.out.println(date.minusDays(2).getDayOfWeek());
//        System.out.println(date.until(date));
//        System.out.println("Date : " + date);
//        System.out.println("Time : " + time);
//        System.out.println("Date and Time : " +dateTime);

        System.out.println();
        System.out.println("After formatting the date time is : " + dateTimeFormatter.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format two: " + dateTimeFormatter1.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format three : " + dateTimeFormatter2.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format four : " + dateTimeFormatter3.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format five : " + dateTimeFormatter4.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format six : " + dateTimeFormatter5.format(dateTime));
        System.out.println();

    }
}

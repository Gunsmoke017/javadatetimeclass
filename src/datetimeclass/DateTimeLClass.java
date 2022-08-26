package datetimeclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLClass {
    public static void main(String[] args) {
        LocalDate date;
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

        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
        System.out.println("Date and Time : " +dateTime);

        System.out.println();
        System.out.println("After formatting the date time is : " + dateTimeFormatter.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format two: " + dateTimeFormatter1.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format three: " + dateTimeFormatter2.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format four: " + dateTimeFormatter3.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format five: " + dateTimeFormatter4.format(dateTime));
        System.out.println();
        System.out.println("After formatting the date time is format six: " + dateTimeFormatter5.format(dateTime));
        System.out.println();

    }
}

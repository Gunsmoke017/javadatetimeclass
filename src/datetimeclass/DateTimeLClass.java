package datetimeclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeLClass {
    public static void main(String[] args) {
        LocalDate date;
        LocalTime time;
        LocalDateTime dateTime;

        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = LocalDateTime.now();

        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
        System.out.println("Date and Time : " +dateTime);
    }
}

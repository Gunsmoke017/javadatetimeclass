package datetimeclass;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shutdown {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String dueTime= "12:36";
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Program is running...");
         System.out.println("current time "+dateTimeFormatter.format(dateTime));
        System.out.println("System will shutdown by " + dueTime);
        try{
            while(!(dateTimeFormatter.format(dateTime).equalsIgnoreCase(dueTime))){
                dateTime = LocalDateTime.now();
            }
            System.out.println("current time "+dateTimeFormatter.format(dateTime));
            if(dateTimeFormatter.format(dateTime).equalsIgnoreCase(dueTime)){
            runtime.exec("shutdown -s ");
                System.out.println("Shutting down now");
            }
        } catch (IOException ie){
            ie.printStackTrace();
        }
    }
}

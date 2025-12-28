
/*
Write a Java method to display the current date and time.
 */
import java.time.LocalDate;
public class DateTime {
    public static void main(String[] args){
        LocalDate localDate= LocalDate.now();
        // localDate is built in class which is used to display the current date
        // LocalTime is used to display the current time
        // LocalDateTime is used to display the both date and time
        System.out.println("The current date is:" +localDate);
    }
}

package DAYSCALCULATOR;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class daysbetweentwdates {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2012,2,2);
        LocalDate end=LocalDate.of(2013,1,1);
        long day= ChronoUnit.DAYS.between(start,end);
        System.out.println(day);
    }


}

package DAYSCALCULATOR;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class dayFinder {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2025,4,5);
        DayOfWeek day=date.getDayOfWeek();
        System.out.println(day);
    }
}

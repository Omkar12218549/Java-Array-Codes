package DAYSCALCULATOR;
import java.time.LocalDate;
public class Add30DAysTopresentDAy {
    public static void main(String[] args) {
        LocalDate today=LocalDate.of(2025,4,5);
        LocalDate futureDate=today.plusDays(30);
        System.out.println(futureDate);
    }
}

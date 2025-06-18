package DAYSCALCULATOR;
import java.time.LocalDate;
import java.time.Period;
public class BirthdayCalculator {
    public static void main(String[] args) {
        LocalDate bith=LocalDate.of(2004,7,1);
        LocalDate today=LocalDate.now();
        Period age=Period.between(bith,today);
        System.out.println("AGE: "+age.getYears()+" Years "+age.getMonths()+" Months "+age.getDays()+" Days");
    }
}

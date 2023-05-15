import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDaysInDateRange {
    
    public static void main(String[] args) {


        
        LocalDate date1 = LocalDate.of(2023, 01, 1);
        LocalDate date2 = LocalDate.of(2022, 01, 10);

        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Days between " + date1 + " and " + date2 + ": " + daysBetween);
    }
}

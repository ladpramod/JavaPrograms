import java.time.LocalDate;
import java.time.Period;

public class BithdayCalculator {
    
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();

        LocalDate birthday = LocalDate.of(1985, 12, 8);

        Period p = Period.between(birthday, today);

        System.out.printf("Hello your age is %d years, %d months and %d days", p.getYears(),p.getMonths(),p.getDays());
    }
}

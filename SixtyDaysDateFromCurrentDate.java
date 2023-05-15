import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SixtyDaysDateFromCurrentDate{

    public static void main(String[] args) {
        
        LocalDate currenDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for(int i=0; i<60; i++){

            LocalDate date = currenDate.minusDays(i);

            String formattedDate = date.format(formatter);
            System.out.println("Date " + (i+1) + ": " + formattedDate);
        }
    }
}
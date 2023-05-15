import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneAllCountries {
    
    public static void main(String[] args) {
        
        ZoneId istTimeZone = ZoneId.of("Asia/Kolkata");

        LocalDateTime istDatetime = LocalDateTime.now(istTimeZone);

        DateTimeFormatter istDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = istDatetime.format(istDateTimeFormatter);

        System.out.println("Current date and time of the timezone: " + formattedDateTime);

        


    }
}

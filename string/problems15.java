import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class problems15 {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formattedDate = currentTime.format(formatter);
        System.out.println("Current Date and Time is: "+formattedDate);
    }
}

import java.time.LocalDate;

public class DateFormatterTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Default Format: " + today);
        System.out.println("dd-MM-yyyy: " + DateFormatterUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println("MMMM dd, yyyy: " + DateFormatterUtils.formatDate(today, "MMMM dd, yyyy"));
        System.out.println("yyyy/MM/dd: " + DateFormatterUtils.formatDate(today, "yyyy/MM/dd"));
    }
}

import java.util.*;
import java.time.LocalDateTime;

public class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TX1001", "TX1002", "TX1003");

        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}

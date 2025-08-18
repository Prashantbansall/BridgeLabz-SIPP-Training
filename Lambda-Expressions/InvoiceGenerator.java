import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionID;

    // Constructor
    Invoice(String transactionID) {
        this.transactionID = transactionID;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction: " + transactionID;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactionIDs = Arrays.asList("T001", "T002", "T003");

        // Using constructor reference to create Invoice objects
        List<Invoice> invoices = transactionIDs.stream()
                                               .map(Invoice::new)
                                               .toList();

        invoices.forEach(System.out::println);
    }
}

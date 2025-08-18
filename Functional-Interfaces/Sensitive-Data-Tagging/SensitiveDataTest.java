public class SensitiveDataTest {
    public static void main(String[] args) {
        CustomerInfo customer = new CustomerInfo("Alice", "123-45-6789");
        String regularData = "Non-sensitive info";

        EncryptionProcessor.process(customer); // marked as SensitiveData
        EncryptionProcessor.process(regularData); // not marked
    }
}

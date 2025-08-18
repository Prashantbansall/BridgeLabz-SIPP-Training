public class EncryptionProcessor {
    public static void process(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data: " + obj);
        } else {
            System.out.println("No encryption needed: " + obj);
        }
    }
}

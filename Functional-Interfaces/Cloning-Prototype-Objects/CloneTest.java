public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeObject original = new PrototypeObject("Template1", 100);
        PrototypeObject cloned = (PrototypeObject) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);
    }
}

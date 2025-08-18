public class ExceptionPropagationDemo {

    // Method 1: Throws ArithmeticException
    static void method1() {
        int result = 10 / 0; // This will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    // Method 2: Calls method1()
    static void method2() {
        method1();
    }

    // Main method: Calls method2() and handles exception
    public static void main(String[] args) {
        try {
            method2();  // Exception will propagate here
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

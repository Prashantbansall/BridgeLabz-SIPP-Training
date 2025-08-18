public class PasswordValidatorTest {
    public static void main(String[] args) {
        String password1 = "Insurance@123";
        String password2 = "weakpass";

        System.out.println(password1 + " is strong? " + SecurityUtils.isStrongPassword(password1));
        System.out.println(password2 + " is strong? " + SecurityUtils.isStrongPassword(password2));
    }
}

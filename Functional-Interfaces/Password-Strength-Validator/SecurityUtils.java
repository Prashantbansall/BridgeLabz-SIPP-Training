public interface SecurityUtils {

    static boolean isStrongPassword(String password) {
        if (password == null) return false;
        // Password must be at least 8 characters, contain upper, lower, digit, and special char
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

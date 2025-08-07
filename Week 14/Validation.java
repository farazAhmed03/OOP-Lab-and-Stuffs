public class Validation {
    public static boolean isValidName(String name) {
        return name.matches("^[A-Z][a-zA-Z]*$");
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z][A-Za-z0-9]*(\\.?_?[A-Za-z0-9]+)*@kust\\.edu\\.pk$");
    }

    public static boolean isValidPhone(String phone) {
        return phone.matches("^0-3\\d{2}-\\d{7}$");
    }

    public static boolean isValidRegNo(String reg) {
        return reg.matches("^SE-\\d{4}-\\d{3}$");
    }
}

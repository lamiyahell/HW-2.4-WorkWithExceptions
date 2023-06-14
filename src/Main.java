import validators.LoginValidator;
import validators.PasswordValidator;

public class Main {
    public static void main(String[] args) {

        Registration registration = new Registration(
        "java_skypro_go|",
        "D_1hWiKjjP_9",
        "D_1hWiKjjP_9");

        LoginValidator.validateLogin(registration.getLogin());
        PasswordValidator.validatePassword(registration.getPassword());
        PasswordValidator.comparePassword(registration.getPassword(), registration.getConfirmPassword());
    }
}
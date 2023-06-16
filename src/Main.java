import validators.LoginValidator;
import validators.PasswordValidator;

public class Main {
    public static void main(String[] args) {

        Registration registration = new Registration(
        "java_skypro_go",
        "D_1hWiKjjP_8",
        "D_1hWiKjjP_8");

        LoginValidator.isLoginValid(registration.getLogin());
        PasswordValidator.isPasswordValid(registration.getPassword(), registration.getConfirmPassword());
    }
}
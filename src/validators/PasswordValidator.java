package validators;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    private boolean isValid;

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException{
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new WrongPasswordException("Пароль не соответствует требованиям!");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают. Попробуйте еще раз!");
        }
    }

    public static boolean isPasswordValid(String password, String confirmPassword) {
        boolean isValid;
        try {
            validatePassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка с введенным паролем: " + e.getMessage());
            isValid = false;
        }
        return true;
    }
}

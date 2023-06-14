package validators;

import exceptions.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void validatePassword(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new WrongPasswordException("Пароль не соответствует требованиям!");
        }
    }

    public static void comparePassword(String password, String confirmPassword) {
        try {
        if (password != confirmPassword) {
        }
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}

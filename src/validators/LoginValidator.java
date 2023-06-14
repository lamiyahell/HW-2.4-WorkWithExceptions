package validators;

import exceptions.WrongLoginException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {

    public static void validateLogin(String login) {
            Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
            Matcher matcher = pattern.matcher(login);
        if (login.length() > 20 || !matcher.matches()) {
            throw new WrongLoginException("Логин не соответствует требованиям!");
        }
    }
}

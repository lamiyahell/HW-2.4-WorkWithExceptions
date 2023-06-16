package validators;

import exceptions.WrongLoginException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {

    public static void validateLogin(String login) throws WrongLoginException{
            Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
            Matcher matcher = pattern.matcher(login);
        if (!matcher.matches()) {
            throw new WrongLoginException("Логин не соответствует требованиям!");
        }
    }

    public static boolean isLoginValid(String login) {
        boolean isValid;
        try {
            validateLogin(login);
            return true;
        } catch (WrongLoginException e) {
            System.out.println("Ошибка с введенным логином: " + e.getMessage());
            isValid = false;
        }
        return true;
    }
}

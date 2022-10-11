package by.itacademy.hw20.task1.service;

import by.itacademy.hw20.task1.exception.IncorrectDateException;
import by.itacademy.hw20.task1.exception.IncorrectPaymentSumException;
import by.itacademy.hw20.task1.exception.WrongLoginException;
import by.itacademy.hw20.task1.exception.WrongPasswordException;
import by.itacademy.hw20.task1.model.hotel.Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidation {

    private static final String PATTERN_LOGIN = "^(([a-zA-Z0-9]+)(_([a-zA-Z0-9]+))*){5,20}$";// знак подчеркивания д.б. в середине
    private static final String PATTERN_PASSWORD = "^[a-zA-Z0-9_]{8,}$";

    public void validateLogin(String login) {
        Pattern pattern = Pattern.compile(PATTERN_LOGIN);
        Matcher matcher = pattern.matcher(login);

        if (!matcher.matches())
            throw new WrongLoginException("Wrong login! The login must contain numbers, digits and underscores, the length is from 5 to 20 characters.");
    }

    public void validatePassword(String password) {
        Pattern pattern = Pattern.compile(PATTERN_PASSWORD);
        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches())
            throw new WrongPasswordException("Wrong password! The password must contain numbers, digits and underscores, the length is from 8 characters.");
    }

    public void validatePeriod(LocalDate start, LocalDate end){
        if (start.isAfter(end)) throw new IncorrectDateException("ERROR! The beginning of the period cannot be greater than the end of the period");
    }

    public void validatePaymentSum(BigDecimal sum, Order order){
        if (sum.compareTo(new BigDecimal(0)) < 0){
            throw new IncorrectPaymentSumException("ERROR! The payment amount cannot be negative.");
        }
        if (sum.compareTo(order.getToPay()) > 0)
        {
            throw new IncorrectPaymentSumException("ERROR! The payment amount cannot exceed the order amount.");
        }
    }

}

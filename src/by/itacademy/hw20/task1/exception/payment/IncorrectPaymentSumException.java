package by.itacademy.hw20.task1.exception.payment;

public class IncorrectPaymentSumException extends RuntimeException{

    public IncorrectPaymentSumException(String message) {
        super(message);
    }
}

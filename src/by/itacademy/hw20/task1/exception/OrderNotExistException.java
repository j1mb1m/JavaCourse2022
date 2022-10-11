package by.itacademy.hw20.task1.exception;

public class OrderNotExistException extends RuntimeException{

    public OrderNotExistException(String message) {
        super(message);
    }
}

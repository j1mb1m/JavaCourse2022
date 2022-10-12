package by.itacademy.hw20.task1.exception.order;

public class OrderNotExistException extends RuntimeException{

    public OrderNotExistException(String message) {
        super(message);
    }
}

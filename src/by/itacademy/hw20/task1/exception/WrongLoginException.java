package by.itacademy.hw20.task1.exception;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException(String message) {
        super(message);
    }
}

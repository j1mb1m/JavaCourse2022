package by.itacademy.hw11.task1.exception;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException(String message) {
        super(message);
    }
}

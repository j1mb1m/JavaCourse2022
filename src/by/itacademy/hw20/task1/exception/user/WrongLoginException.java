package by.itacademy.hw20.task1.exception.user;

public class WrongLoginException extends RuntimeException{

    public WrongLoginException(String message) {
        super(message);
    }
}

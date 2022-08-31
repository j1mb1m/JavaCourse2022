package by.itacademy.hw10.task4.exception;

public class ReturnAnimalNotSupportException extends Exception{

    public ReturnAnimalNotSupportException() {

        System.out.println("Животное не продавалось! Возврат не возможен.");
    }
}

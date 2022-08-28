package by.itacademy.hw9.task1;

/**
 * Написать калькулятор, который содержит обобщенные
 * статические методы - sum, multiply, divide, subtraction.
 * Параметры этих методов  - два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Main {
    public static void main(String[] args) {
        Calculator.sum(1, 2.5);
        Calculator.sum(1, 4);
        Calculator.multiply(1, 2.5);
        Calculator.multiply(1, 4);
        Calculator.divide(1, 2.5);
        Calculator.divide(1, 4);
        Calculator.subtraction(1, 2.5);
        Calculator.subtraction(1, 4);
    }
}

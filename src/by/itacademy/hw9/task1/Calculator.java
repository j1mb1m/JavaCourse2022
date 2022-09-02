package by.itacademy.hw9.task1;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
       return t.doubleValue() * v.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        return t.doubleValue() / v.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T t, V v) {
        return t.doubleValue() - v.doubleValue();
    }
}

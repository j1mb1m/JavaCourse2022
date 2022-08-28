package by.itacademy.hw9.task1;

public class Calculator {

    public static <T extends Number, V extends Number> void sum(T t, V v) {
        System.out.printf("%s + %s = %s%n",t.toString(), v.toString(), (t.doubleValue() + v.doubleValue()));
    }
    public static <T extends Number, V extends Number> void multiply(T t, V v) {
        System.out.printf("%s * %s = %s%n",t.toString(), v.toString(), t.doubleValue() * v.doubleValue());
    }
    public static <T extends Number, V extends Number> void divide(T t, V v) {
        System.out.printf("%s / %s = %s%n",t.toString(), v.toString(), t.doubleValue() / v.doubleValue());
    }
    public static <T extends Number, V extends Number> void subtraction(T t, V v) {
        System.out.printf("%s - %s = %s%n",t.toString(), v.toString(), (t.doubleValue() - v.doubleValue()));
    }
}

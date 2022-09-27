package by.itacademy.hw18.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Class<?> myClass = HashMap.class;

        printFields(myClass);
        printParentClass(myClass);
        printConstructors(myClass);
        printInnerClasses(myClass);
        printMethods(myClass);
    }

    private static void printMethods(Class<?> myClass) {
        System.out.printf("%nMethods: ");
        System.out.println(Arrays.stream(myClass.getDeclaredMethods())
                .map(method -> String.format("%s %s%n",
                        method.getName(),
                        Arrays.stream(method.getParameterTypes())
                                .map(Class::getSimpleName)
                                .collect(Collectors.toList())))
                .collect(Collectors.joining("         ")));
    }

    private static void printInnerClasses(Class<?> myClass) {
        System.out.printf("%nInner classes: ");
        System.out.println(Arrays.stream(myClass.getNestMembers())
                .map(Class::getSimpleName)
                .collect(Collectors.joining(", ")));
    }

    private static void printConstructors(Class<?> myClass) {
        System.out.printf("%nConstructors: ");
        System.out.println(Arrays.stream(myClass.getConstructors())
                .map(constructor -> String.format("%s %s",
                        constructor.getDeclaringClass().getSimpleName(),
                        Arrays.stream(constructor.getParameterTypes()).toList()))
                .collect(Collectors.joining(", ")));
    }

    private static void printParentClass(Class<?> myClass) {
        System.out.printf("Parent class: %s", myClass.getSuperclass().getSimpleName());
    }

    private static void printFields(Class<?> myClass) {
        System.out.printf("%nFields: ");
        System.out.println(Arrays.stream(myClass.getDeclaredFields())
                .map(field -> String.format("%s %s %n", field.getType(), field.getName()))
                .collect(Collectors.joining("        ")));
    }
}

package by.itacademy.hw10.task3;

import java.util.Random;

/**
 * Реализуйте свой собственный стек (очередь LIFO) со стандартными
 * функциями push() и pop(), а также с дополнительной функцией max().
 * Продемонстрируйте его работу.
 */
public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 13; i++) {
            System.out.printf("push: %s%n", stack.push(new Random().nextInt(20)));
        }

        System.out.printf("max value - %s%n", stack.max());
        System.out.printf("stack size - %s%n%n", stack.size());

        for (int i = 0; i < 10; i++) {
            if (stack.empty()) break;
            System.out.printf("pop: %s%n", stack.pop());
        }

        System.out.printf("max value - %s%n", stack.max());
        System.out.printf("stack size - %s%n%n", stack.size());


        Stack<String> stringStack = new Stack<>();
        System.out.printf("push: %s%n", stringStack.push("a"));
        System.out.printf("push: %s%n", stringStack.push("s"));
        System.out.printf("push: %s%n", stringStack.push("d"));
        System.out.printf("push: %s%n", stringStack.push("y"));
        System.out.printf("push: %s%n", stringStack.push("r"));

        System.out.printf("max value - %s%n", stringStack.max());
        System.out.printf("stack size - %s%n%n", stringStack.size());

        System.out.printf("pop: %s%n", stringStack.pop());
        System.out.printf("pop: %s%n", stringStack.pop());

        System.out.printf("max value - %s%n", stringStack.max());
        System.out.printf("stack size - %s%n%n", stringStack.size());
    }
}

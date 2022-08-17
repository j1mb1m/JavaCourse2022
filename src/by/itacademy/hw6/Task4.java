package by.itacademy.hw6;

import java.util.Scanner;

/*4. Решить задачу с помощью класса StringBuilder
●	Дано два числа, например 3 и 56, необходимо составить следующие строки:
 3 + 56 = 59
 3 – 56 = -53
 3 * 56 = 168.
●	Замените символ “=” на слово “равно”.
*/
public class Task4 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int numFirst = enterFromScanner("Enter first number: ");
        int numSecond = enterFromScanner("Enter second number: ");

        StringBuilder sbSum = performArithmeticOperation(numFirst, numSecond, '+');
        StringBuilder sbMultiply = performArithmeticOperation(numFirst, numSecond, '*');
        StringBuilder sbSubtract = performArithmeticOperation(numFirst, numSecond, '-');

        System.out.println(sbSum);
        System.out.println(sbMultiply);
        System.out.println(sbSubtract);
        System.out.println();

        replaceString(sbSum, "=", "равно");
        replaceString(sbMultiply, "=", "равно");
        replaceString(sbSubtract, "=", "равно");
        System.out.println(sbSum);
        System.out.println(sbMultiply);
        System.out.println(sbSubtract);

    }

    public static StringBuilder performArithmeticOperation(int numFirst, int numSecond, char ch) {
        StringBuilder sb = new StringBuilder();
        switch (ch) {
            case '+':
                sb.append(numFirst).append(" " + ch + " ").append(numSecond).append(" = ").append(numFirst + numSecond);
                break;
            case '*':
                sb.append(numFirst).append(" " + ch + " ").append(numSecond).append(" = ").append(numFirst * numSecond);
                break;
            case '-':
                sb.append(numFirst).append(" " + ch + " ").append(numSecond).append(" = ").append(numFirst - numSecond);
                break;
            default:
                break;
        }
        return sb;

    }

    public static void replaceString(StringBuilder sb, String oldStr, String newStr) {
        sb.replace(sb.indexOf(oldStr), sb.indexOf(oldStr) + oldStr.length(), newStr);
    }

    public static int enterFromScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Error! Try again: ");
        }

        return scanner.nextInt();
    }
}

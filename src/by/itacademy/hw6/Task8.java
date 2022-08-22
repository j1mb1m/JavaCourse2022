package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*8. Шестнадцатеричный цвет. Символ # (необязательно), затем слово, состоящее из букв от a до f или цифр, длиной 3 или 6:
Пример:
●	FFFFFF
●	 #000
●	101011
*/
public class Task8 {
    private static final String COLORHEX_PATTERN = "^(#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6}))$";

    public static void main(String[] args) {

        String text = enterFromScanner("Введите шестнадцатеричный цвет : ");
        System.out.println("Цвет введен " + (isColorHEX(text) ? "верно" : "не верно"));

    }

    public static boolean isColorHEX(String text) {

        Pattern pattern = Pattern.compile(COLORHEX_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        return matcher.matches();
    }

    public static String enterFromScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);

        return scanner.nextLine();
    }
}

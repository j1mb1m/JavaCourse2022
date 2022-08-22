package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*6. Дана строка “Versions: Java  5, Java 6, Java 7, Java 8, Java 12.”  Найти все подстроки "Java X" и распечатать их.*/
public class Task6 {

    public static void main(String[] args) {

        System.out.println("Original: " + getText());
        printAllWords(getText(), "Java\s+[0-9]+");

    }

    public static void printAllWords(String text, String regex) {

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start,end));
        }

    }

    public static String getText() {
        return "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";
    }
}

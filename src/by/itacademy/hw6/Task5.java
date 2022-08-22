package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*5. Напишите метод, заменяющий в строке каждое второе вхождение
«object-oriented programming» (не учитываем регистр символов) на «OOP».
*/
public class Task5 {

    public static void main(String[] args) {

        System.out.println("Original: " + getText());
        System.out.println("Modified: " + replaceEvenWords(getText(), "object-oriented programming","OOP"));

    }

    public static String replaceEvenWords(String text, String oldString, String newString) {

        StringBuilder sb = new StringBuilder();
        Pattern pattern = Pattern.compile(oldString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        boolean isOdd = false;
        int lastIndex = 0;
        int start;
        int end = 0;

        while (matcher.find()) {
            start = matcher.start();
            end = matcher.end();
            if (!isOdd) {
                sb.append(text, lastIndex, start).append(newString);
            } else {
                sb.append(text, lastIndex, end);
            }
            lastIndex = end;
            isOdd = !isOdd;
        }
        if (end != text.length()) {
            sb.append(text, end, text.length());
        }
        return sb.toString();
    }

    public static String getText() {
        return "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
    }
}

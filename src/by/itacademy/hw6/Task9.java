package by.itacademy.hw6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*9. Email. Общий вид — логин@поддомен.домен.
Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек.
А домен (имеется в виду 1го уровня) — это от 2 до 6 букв.
Пример:
●	 myemail@gmail.com
●	 a.petrov@gmail.com.au
●	 coder4575@yandex.ru
*/
public class Task9 {

    //должен начинаться с буквы, может содержать подчеркивание, дефис и точку и должен заканчиваться на букыу или число до домена
    private static final String EMAIL_PATTERN = "^(([A-Za-z])+(([A-Za-z0-9])*((\\.|\\-|\\_)*[A-Za-z0-9]+)*)*)@(([A-Za-z])+(([A-Za-z0-9])*((\\.|\\-)*[A-Za-z0-9]+)*)*)\\.([A-Za-z]{2,6})$";

    public static void main(String[] args) {

        String[] text = getTrueEmail();
        System.out.println("Тест по правильным e-mail:");
        for (String str : text) {
            System.out.println("E-mail " + str + " введен " + (isCorrectEmail(str) ? "верно" : "не верно"));
        }

        System.out.println();

        text = getBadEmail();
        System.out.println("Тест по не правильным e-mail:");
        for (String str : text) {
            System.out.println("E-mail " + str + " введен " + (isCorrectEmail(str) ? "верно" : "не верно"));
        }
    }

    public static boolean isCorrectEmail(String text) {

        Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        return matcher.matches();
    }

    public static String[] getTrueEmail() {
        String[] array = {"hello@example.com",
                "ello@example.co.uk",
                "hello-2020@example.com",
                "hello.2020@example.com",
                "hello_2020@example.com",
                "h@example.com",
                "h@example-example.com",
                "h@example-example-example.com",
                "h@example.example-example.com",
                "hello.world-2020@example.com"};
        return array;
    }

    public static String[] getBadEmail() {
        String[] array = {"hello",
                "hello@2020@example.com",
                ".hello@example.com",
                "hello.@example.com",
                "hello..world@example.com",
                "hello!+2020@example.com",
                "hello@example.a",
                "hello@example..com",
                "hello@.com",
                "hello@.com.",
                "hello-@t.com",
                "hello@-example.com",
                "hello@example.com-",
                "hello@example_example.com"};
        return array;
    }

}



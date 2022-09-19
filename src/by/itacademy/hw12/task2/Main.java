package by.itacademy.hw12.task2;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Создать файл с текстом, прочитать, подсчитать
 * в тексте количество знаков препинания и слов.
 */
public class Main {

    private final static String PATTERN_PUNCTUATION_MARKS = "([.,:;!?()\"'\\[\\]])|( - )"; //все знаки, кроме дефиса
    private final static String DELIMITER_MARKS = " -.,()[]!?;:'\""; //разделители

    public static void main(String[] args) {

        FileHandler fileHandler = new FileHandler();

        fileHandler.writeFile("hw12_task2.txt", getText());
        String text = fileHandler.readFile("hw12_task2.txt");

        System.out.println("Количество слов : " + getCountWords(text));
        System.out.println("Количество знаков препинания  : " + getCountPunctuationMarks(text));

    }

    public static int getCountWords(String text){

        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER_MARKS);
        int countWords = 0;

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            countWords ++;
        }

        return countWords;
    }

    public static int getCountPunctuationMarks(String text){

        Pattern pattern = Pattern.compile(PATTERN_PUNCTUATION_MARKS);
        Matcher matcher = pattern.matcher(text);

        int countPunctuationMarks = 0;
        while (matcher.find()) {
            countPunctuationMarks++;
        }

        return countPunctuationMarks;
    }

    public static String getText() {
        return "Java is a high-level, class-based, object-oriented programming language that is designed" +
                " to have as few implementation dependencies as possible. It is a general-purpose programming " +
                "language intended to let programmers write once, run anywhere (WORA), meaning that compiled" +
                " Java code can run on all platforms that support Java without the need to recompile.";
    }
}

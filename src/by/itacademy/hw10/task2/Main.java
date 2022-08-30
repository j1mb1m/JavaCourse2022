package by.itacademy.hw10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ввести текст с клавиатуры. Для текста создать
 * Map, где ключом будет слово, а значение –
 * количество повторений этого слова в тексте.
 */

public class Main {

    private final static String PATTERN_WORD = "[^0-9a-zA-Zа-яА-Я']+";

    public static void main(String[] args) {
      //  String text = "London is the capital of the United Kingdom of Great Britain and Northern Ireland, situated on both sides of the Thames River; it's the political, financial, commercial, industrial, and cultural centre of Great Britain. It is the largest city in Europe with the total population of about 8 million people.";
        String text = getText();
        String[] arrayStrings = text.replaceAll(PATTERN_WORD, " ").split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String str : arrayStrings) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int count = map.get(str);
                map.put(str, ++count);
            }
        }

        System.out.println("The text contains the following words:");
        map.forEach((s, integer) -> System.out.printf("%s  - %s units%n", s, integer));
    }

    public static String getText(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");

       return scanner.nextLine();
    }


}


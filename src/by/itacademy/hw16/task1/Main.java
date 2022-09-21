package by.itacademy.hw16.task1;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Дана коллекция Collection<String> col. С помощью stream api:
 * ○	узнать, содержит ли какая-нибудь из строк слово login
 * ○	найти самую длинную строку
 * ○	найти самую короткую строку
 * ○	найти строки-слова (не содержат пробелов и знаков препинания)
 * ○	получить все слова используемые в строках
 */

public class Main {

    private final static String WORD_PATTERN = "[A-Za-z0-9]+";

    private final static List<String> WORDS = List.of("I love Java",
            "London is the capital of Great Britain",
            "Java is easy",
            "Predicate",
            "Some word");


    public static void main(String[] args) {
        System.out.printf("1. Does any of the strings contain the word 'login' - %s%n", isContain("login"));
        System.out.printf("2. The large string - '%s'%n", findString((x, y) -> y.length() - x.length()));
        System.out.printf("3. The small string - '%s'%n", findString(Comparator.comparingInt(String::length)));
        System.out.printf("4. Strings-words: '%s'%n", findStringsWords());
        System.out.printf("5. Get all words used in strings: '%s'%n", getArrayWords());
    }

    public static boolean isContain(String str) {
        return WORDS.stream()
                .anyMatch(x -> x.toLowerCase().contains(str.toLowerCase()));
    }

    public static String findString(Comparator<String> comparator) {

        return WORDS.stream().sorted(comparator)
                .findFirst()
                .orElse("");
    }

    public static List<String> findStringsWords() {

        return WORDS.stream().filter(x -> Pattern.compile(WORD_PATTERN).matcher(x).matches())
                .toList();
    }

    public static List<String> getArrayWords() {

        return WORDS.stream()
                .flatMap(s -> Stream.of(s.trim().split(" ")))
                .distinct()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

    }

}

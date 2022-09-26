package by.itacademy.hw16.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
 * Используя stream и lambda выполнить следующие действия:
 * ○	Удалить все содержащие “3”
 * ○	Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
 * ○	Отбросить первый и последний элемент
 * ○	Привести в uppercase
 * ○	Выдать на печать результат
 * ○	Напечатать количество оставшихся элементов
 */

public class Main {

    private final static List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");

    public static void main(String[] args) {

        List<String> tempMyList  = myList.stream()
                .filter(x -> !x.contains("3")) //Удалить все содержащие “3”
                .sorted((x, y) -> {
                    if (Integer.valueOf(x.charAt(1)).equals((int) y.charAt(1))) {
                        return y.charAt(0) - x.charAt(0);
                    } else {
                        return x.charAt(1) - y.charAt(1);
                    }
                }).collect(Collectors.toList()); //Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)

        long totalCount = tempMyList.stream()
                .skip(1) //Отбросить первый элемент
                .limit(tempMyList.size() - 2) //Отбросить последний элемент
                .peek(x -> System.out.println(x.toUpperCase()))
                .count(); //Напечатать количество оставшихся элементов

        System.out.println("Total count: " + totalCount);

    }
}

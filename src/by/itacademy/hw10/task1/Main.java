package by.itacademy.hw10.task1;

import java.util.HashSet;
import java.util.Set;

/**
 * Напишите методы union(Set<?> set1, Set<?> set2)
 * и intersect(Set<?> set1, Set<?> set2), реализующих
 * операции объединения и пересечения множеств.
 */
public class Main {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Cat");
        set1.add("Mouse");
        set1.add("Fox");

        Set<String> set2 = new HashSet<>();
        set2.add("Dog");
        set2.add("Fox");

        System.out.println("union:");
        Set<String> unionSet = union(set1, set2);
        unionSet.forEach(x -> System.out.printf("> %s%n", x));

        System.out.println("intersect:");
        Set<String> intersectSet = intersect(set1, set2);
        intersectSet.forEach(x -> System.out.printf("> %s%n", x));

    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {

        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {

        Set<T> intersectSet = new HashSet<>();

        for (T value : set1) {
            if (set2.contains(value)) {
                intersectSet.add(value);
            }
        }

        return intersectSet;
    }
}

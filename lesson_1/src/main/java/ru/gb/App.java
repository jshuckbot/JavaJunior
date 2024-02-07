package ru.gb;

import java.util.Arrays;
import java.util.List;

/**
 * lesson_1
 */
public class App {
    private static double getAverage(List<Integer> list) {
        return list.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(num -> num)
                .average()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 22, 14, 8);
        double avg = getAverage(list);
        System.out.println(avg);
    }
}

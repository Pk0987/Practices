package org.example.practices.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAlphabetic {
    public static void main() {
        List<String> names = Arrays.asList("eggte","rtrwt","retrt","hdhdh","sdfsf","dgdd");

        List<String> ascending = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ascending);

        List<String> decending = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(decending);
    }
}
